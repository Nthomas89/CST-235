/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicho
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Assignment6 <E> {
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	private final Lock readLock = readWriteLock.readLock();

	private final Lock writeLock = readWriteLock.writeLock();

	private final List<E> list = new ArrayList<>();
	
	public void set(E o)
	{
		writeLock.lock();
		try
		{ list.add(o);}
                
		finally
		{ writeLock.unlock();}
	}
	
	public E get(int i)
	{
		readLock.lock();
		try
		{ return list.get(i);}
		finally
		{ readLock.unlock();}
	}
      public static void main(String[] args) throws IOException
      {
    	  String fileContents = new String(); 
           Assignment6<String> threadSafeArrayList = new Assignment6<>();
           threadSafeArrayList.set("Open");
           threadSafeArrayList.set("Create");
           threadSafeArrayList.set("Close");
           
           BufferedReader br = new BufferedReader(new FileReader("Assignment-6.txt"));
           try {
               StringBuilder sb = new StringBuilder();
               String line = br.readLine();

               while (line != null) {
                   sb.append(line);
                   sb.append(System.lineSeparator());
                   line = br.readLine();
               }
               String everything = sb.toString();
               fileContents = everything;
               System.out.println(everything);
           } finally {
               br.close();
           }
           
           try(FileWriter fw = new FileWriter("Assignment-6.txt", true);
        		    BufferedWriter bw = new BufferedWriter(fw);
        		    PrintWriter out = new PrintWriter(bw))
        		{
        	   		if(fileContents.isEmpty()){
        		    out.println("File has been Created");
        		    }
        		    
        		    out.println("TEXT");
        		    //more code
        		} catch (IOException e) {
        		    //exception handling left as an exercise for the reader
        		}

      }
    
}
