import java.io.Serializable;

/**
 * @author Nicholas thomas
 * File: calculator.java
 * Date: 9/9/18
 * Summary: creating the getters and setters, and determining the time and space needed
 * for different video files.
 */

@SuppressWarnings("serial")
public class calculator implements Serializable {
	
	 // fields
	private int resolution;
	private int lengthSeconds;
    private int fileSizeMB;
    private int fileSizeGB;

    // no argument constructor
    public calculator() {
    }

    // getter setter lengthSeconds
    public int getLengthSeconds() {
        return lengthSeconds;
    }

    public void setLengthSeconds(int lengthInSeconds) {
        this.lengthSeconds = lengthInSeconds;
    }

    // getter setter resolution
    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    // getter setter GB
    public int getFileSizeGB() {
        return fileSizeGB;
    }

    public void setFileSizeGB(int dataSizeGB) {
        this.fileSizeGB = dataSizeGB;
    }
    
    // getter setter MB
    public int getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(int dataSizeMB) {
        this.fileSizeMB = dataSizeMB;
    }


    // recommended resolutions 
    public void calculateFileSize()
    {
    	// 5mbps is standard for 720p
        if(getResolution() == 720){
            setFileSizeGB((lengthSeconds * 5 / 8) / 1000); // GB
            setFileSizeMB((lengthSeconds * 5 / 8) % 1000); // MB
            
        }
        // 8mbps is standard for 1080p
        else if(getResolution() == 1080){
            setFileSizeGB((lengthSeconds * 8 / 8) / 1000); // GB
            setFileSizeMB((lengthSeconds * 8 / 8) % 1000); // MB
        }
    }

    // toString method for displaying data required for storing videos
    public String toString()
    {
        return "For a video file " + (getLengthSeconds()/60) + " minutes and " + (getLengthSeconds()%60) + " seconds of " + getResolution() +
                "p video. the file size would be " + getFileSizeGB() + " GB and " + getFileSizeMB() + " MB";
    }

}
