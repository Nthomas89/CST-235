package Short_Assignment_2;

@SuppressWarnings("serial")
public class video_Info implements java.io.Serializable {
    private int resolution = 0;
    private double video_length = 0;
    private double file_size = 0;
    
    public video_Info (int resolution, double video_length ){
        setResolution(resolution);
        setVideo_length(video_length);
    }
    
    public void setResolution(int resolution){
        this.resolution = resolution;
    }
    
    public int getResolution(){
        return this.resolution;
    }
    
    public void setVideo_length(double video_length){
        this.video_length = video_length;
    }
    
    public double getVideo_length(){
        return this.video_length;
    }
    
    public String getFile_size(){
        if(getResolution() == 720){
            file_size = video_length * 5; // 5mbps is recommended size for 720p video
        }else if(getResolution() == 1080){
            file_size = video_length * 8; // 8mbps is recommended size for 1080p video
        }
        
        if(file_size > 1000){
            String formattedString = String.format("%.02f", file_size/1000) + " GB of disk space required.";
            return formattedString;
        }else{
            return Double.toString(file_size) + " MB of disk space required.";
        }
        
        
    }
    
}