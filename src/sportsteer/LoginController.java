/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsteer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import animatefx.animation.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.events.JFXDialogEvent;
import com.jfoenix.validation.RegexValidator;
import com.jfoenix.validation.RequiredFieldValidator;
/*import java.beans.Statement;*/
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Window;
import javax.swing.JOptionPane;


/**
 *
 * @author Dexter Sam
 */
public class LoginController implements Initializable {
    
    @FXML
    private ImageView signbackbtn;
    @FXML
    private Button signupbtn;
    @FXML
    private Pane signuppane;
    @FXML
    private Pane signinpane;
    @FXML
    private JFXButton signupdonebtn;
    @FXML
    private JFXTextField usernamelogin;
    @FXML
    private JFXPasswordField signuppassword;
    @FXML
    private JFXTextField signupname;
    @FXML
    private JFXTextField signupmail;
    @FXML
    private JFXButton signindone;
    @FXML
    private JFXPasswordField userpasswordlogin;
    @FXML
    private StackPane rootpane;
    @FXML
    private AnchorPane rootanchorpane;
    
        
    private Connection connection = null;
    private PreparedStatement statement = null;
    ResultSet resultSet;
    
    //main method
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //method for coonecting db and application
        try {
            //connenction code
           connection= db.DBConnection.makeconnect();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RequiredFieldValidator requiredName = new RequiredFieldValidator ();
        requiredName.setMessage("Please enter valid username");
        RequiredFieldValidator requiredPassword = new RequiredFieldValidator ();
        requiredPassword.setMessage("Please enter valid password");
        RequiredFieldValidator requiredEmail = new RequiredFieldValidator ();
        requiredEmail.setMessage("Please enter required Email");
        
        RegexValidator validmailvalidator = new RegexValidator();
        validmailvalidator.setRegexPattern("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        validmailvalidator.setMessage("Please enter valid Email Address");
        
        
        usernamelogin.getValidators().add(requiredEmail);
        usernamelogin.getValidators().add(validmailvalidator);
        userpasswordlogin.getValidators().add(requiredPassword);
        
        signupname.getValidators().add(requiredName);
        signupmail.getValidators().add(requiredEmail);
        signuppassword.getValidators().add(requiredPassword);
        
        signupname.focusedProperty().addListener((o,oldVal ,newVal)->{
              if(!newVal)signupname.validate();
         });
        signupmail.focusedProperty().addListener((o,oldVal ,newVal)->{
           
              if(!newVal)signupmail.validate();
         });
        
        signuppassword.focusedProperty().addListener((o,oldVal ,newVal)->{
 
              if(!newVal)signuppassword.validate();
         });
        
        usernamelogin.focusedProperty().addListener((o,oldVal ,newVal)->{
       
              if(!newVal)usernamelogin.validate();
         }); 
        userpasswordlogin.focusedProperty().addListener((o,oldVal ,newVal)->{
             
              if(!newVal)userpasswordlogin.validate();
         }); 
        
  
    } 
    
    //signin page jumping  method
    @FXML
    private void handleButtonAction(MouseEvent event) {
         if(event.getSource().equals(signbackbtn)){
              clearfields();
             //animation code
             new SlideInLeft(signinpane).play(); 
             //disabling currrent pane
             signuppane.setVisible(false);
             //enabling desired pane
             signinpane.setVisible(true);
            
            
         }
    }
     //signup page jumping  method
    @FXML
    private void handleMouseEvent(MouseEvent event) {
         if(event.getSource().equals(signupbtn)){
             clearfields();
            //animation code 
            new BounceInRight(signuppane).play(); 
            //enabling desired pane
            signuppane.setVisible(true);
            //disabling current pane
            signinpane.setVisible(false);
            //signuppane.toFront();
         }
    }
    
        //clearing input fields
    void clearfields(){
        signupname.setText("");
        signupmail.setText("");
        signuppassword.setText("");
    }
    
    //create new user
    @FXML
    private void registrationmethod(ActionEvent event) throws SQLException, IOException {
        
           
           String sql = "Insert into users(UserName,UserPassword,UserEmail) Values(?,?,?)";
           String username = signupname.getText();
           String userpassword = signuppassword.getText();
           //Encryption algorithm call
           userpassword = getMd5(userpassword);
           String useremail = signupmail.getText();
        
        try {                
            statement = connection.prepareStatement(sql);
            statement.setString(1,username);
            statement.setString(2,userpassword);
            statement.setString(3,useremail );
        
         
        
                int i= statement.executeUpdate();
                if(i==1){
                System.out.println("Data added");
                    System.out.println("Sign up succes");
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("DashBoard.fxml")));
                    stage.setScene(scene);
                    stage.show();
                }
                clearfields();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                statement.close();
        }
         
        
          
    }
    
    public static String getMd5(String input) 
    { 
        try { 
  
            // Static getInstance method is called with hashing MD5 
            MessageDigest md = MessageDigest.getInstance("MD5"); 
  
            // digest() method is called to calculate message digest 
            //  of an input digest() return array of byte 
            byte[] messageDigest = md.digest(input.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            return hashtext; 
        }  
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    } 

    //check if the user exists or not
    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
         usernamelogin.validate();
         userpasswordlogin.validate();
         getUserDataFromDatabse(usernamelogin.getText(),getMd5(userpasswordlogin.getText()),event);
    }

    private void getUserDataFromDatabse(String mail, String password,ActionEvent event) throws IOException {
        String sql = "SELECT *  FROM users where UserEmail=? AND UserPassword =?";
        try {
            //set this values using PreparedStatement
            statement = connection.prepareStatement(sql);
            statement.setString(1,mail);
            statement.setString(2,password);
            resultSet = statement.executeQuery();
            //if true change to dashhboard page 
            if(resultSet.next()) {
                    System.out.println("Sign in succes");
                    Node node = (Node) event.getSource();
                    Stage stage = (Stage) node.getScene().getWindow();
                    stage.close();
                    Scene scene = new Scene(FXMLLoader.load(getClass().getResource("DashBoard.fxml")));
                    stage.setScene(scene);
                    stage.show();
            }
            else{
              System.out.println("Sign in failed");
              //dialog builder code start
              BoxBlur blur =new BoxBlur(3,3,3);
              JFXDialogLayout dialoglayout = new JFXDialogLayout();
              JFXButton button = new JFXButton("OK");
              JFXDialog dialog;
              dialog = new JFXDialog(rootpane,dialoglayout,JFXDialog.DialogTransition.TOP);
              
              button.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mousevent)->{
              dialog.close();
              });
              
              dialoglayout.setHeading(new Label("UserName or Password Wrong"));
              dialoglayout.setActions(button);
              dialog.show();
              
              dialog.setOnDialogClosed((JFXDialogEvent events)->{
              rootanchorpane.setEffect(null);
             });
             rootanchorpane.setEffect(blur);
             //code end
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
        
}
