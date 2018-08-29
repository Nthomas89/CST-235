package Short_Assignment_2;

import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Client extends Application {
    
  
    public void start(Stage primaryStage) {
        //Vbox info
        VBox vbox = new VBox();
        VBox.setVgrow(vbox, Priority.ALWAYS);
        vbox.setAlignment(Pos.BASELINE_CENTER);
        vbox.setPadding(new Insets(50, 30, 50, 20));
        vbox.setSpacing(30);
        
        //video resolution
        vbox.getChildren().add(new Label("Video Resolution: 720/1080"));
        TextField resolution = new TextField();
        resolution.setPrefWidth(60);
        vbox.getChildren().add(resolution);
        
        //video length
        vbox.getChildren().add(new Label("Video Length in seconds:"));
        TextField length = new TextField();
        length.setPrefWidth(60);
        vbox.getChildren().add(length);
        
        //button for video size
        Button videoSize_btn = new Button();
        videoSize_btn.setText("Get Video Size");
        vbox.getChildren().add(videoSize_btn);
        
        //video storage size
        Label diskSize = new Label("");
        vbox.getChildren().add(diskSize);
        
        //size of the box
        VBox root = new VBox();
        root.getChildren().add(vbox);
        Scene scene = new Scene(root, 300, 400);
        
        videoSize_btn.setOnAction(new EventHandler<ActionEvent>() {
            
            //calculates the video storage
            public void handle(ActionEvent event) {
                 Integer value1 = Integer.valueOf(resolution.getText());
                 Integer value2  = Integer.valueOf(length.getText());
                 video_Info sizeVideo = new video_Info(value1, value2);
                 diskSize.setText(sizeVideo.getFile_size());
                 primaryStage.setScene(scene);
                 primaryStage.show();
            }
        });
        
        primaryStage.setTitle("Calculate File Size");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

 
    public static void main(String[] args)  {
    	 launch(args);
    }
    
}