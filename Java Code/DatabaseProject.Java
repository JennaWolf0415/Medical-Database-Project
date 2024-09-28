//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: DatabaseProject.java
//purpose: starting point for the project, used to run the code and open the first interface
package databaseproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DatabaseProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    }

    public static void main(String[] args) {
        new LoginInterface().setVisible(true);  //starts the LoginInterface jpanel
    }
    
}
