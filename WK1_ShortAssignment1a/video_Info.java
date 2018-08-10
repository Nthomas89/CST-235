/**
 * @author Nicholas thomas
 * File: video_Infor.java
 * Date: 9/9/18
 * Summary: creating the video data that will be used in the calculator class for storage
 * space determination.
 */

    public class video_Info {
    	
    	public static void main (String[] arg) {
    		
    		// creating the first video info
    		calculator video1 = new calculator();
    		video1.setLengthSeconds(7200); // 2hrs
    		video1.setResolution(1080);
    		video1.calculateFileSize();
    		
    		// write info to the console
    		System.out.println(video1.toString());
    		
    		// creating the second video info
    		calculator video2 = new calculator();
    		video2.setLengthSeconds(7200); // 2hrs
    		video2.setResolution(720);
    		video2.calculateFileSize();
    		
    		// write info to the console
    		System.out.println(video2.toString());
    		
    		// creating the second video info
    		calculator video3 = new calculator();
    		video3.setLengthSeconds(1600); // 26mins 40sec
    		video3.setResolution(720);
    		video3.calculateFileSize();
    				
    		// write info to the console
    		System.out.println(video3.toString());
    		
    		
    	}

    }