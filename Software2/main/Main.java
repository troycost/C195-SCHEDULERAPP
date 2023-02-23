package main;

import Database.DBConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * The Main class that will run the application.
 *
 * @author Troy Cost, Student ID: 002197948, Software II - C195
 *
 */
public class Main extends Application {

    /**
     * Initializes the Login screen
     *
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("../views/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setTitle("Troy's Scheduling Application");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main method loads all database connection and launches the screen.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        DBConnection.getConnection();
        launch(args);
        DBConnection.closeConnection();
    }

}