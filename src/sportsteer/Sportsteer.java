/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsteer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Dexter Sam
 */
public class Sportsteer extends Application {
    private double xOffset = 0 ;
    private double yOffset = 0 ;

    

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        
        
       Image image = new Image("/images/cricket_1.png");
       stage.getIcons().add(image);
       stage.setTitle("Sportsteer");
        
        
        root.setOnMousePressed((MouseEvent event)->{
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);
        
    }
    
}
