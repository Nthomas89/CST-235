/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicho
 */
public class bibleVerse {
    
    // selected word for verse one, two, and three 
	private String v;
	
	// no arg constructor
	public bibleVerse(){
		
	}
// bible verse 
	String bibleVerse = "But he said to me, my grace is sufficient for you, for my power is made perfect "
			+ "in weakness.” Therefore I will boast all the more gladly about my weaknesses, so that "
			+ "Christ’s power may rest on me. That is why, for Christ’s sake, I delight in weaknesses, "
			+ "in insults, in hardships, in persecutions, in difficulties. For when I am weak, then I am strong";
	
	// getters and setters for verses
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}

	// Word search method for verse 1
	public static int verseSearchOne(String bibleVerse, String v){
		int i;
	    int last = 0;
	    int count = 0;
	    do {
	        i = bibleVerse.indexOf(v, last);
	        if (i != -1) count++;
	        last = i + v.length();
	    } while(i != -1);
	    return count;
	}
}
