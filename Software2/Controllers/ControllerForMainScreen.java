package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This is the main screen. A list  will show the  Appointments, Customers, and Reports buttons.
 */

public class ControllerForMainScreen {

    @FXML private Button mainMenuAppointmentClick;
    @FXML private Button mainMenuCustomerClick;
    @FXML private Button mainMenuExitClick;
    @FXML private Button mainMenuReportsClick;

    /**
     * Go to appointments main menu.
     * @param event
     * @throws IOException
     */
    @FXML
    void mainMenuAppointmentClick(ActionEvent event) throws IOException {

        Parent appointmentMenu = FXMLLoader.load(getClass().getResource("../views/Appointments.fxml"));
        Scene scene = new Scene(appointmentMenu);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     * This will take us to customers screen.
     * @param event
     * @throws IOException
     */
    @FXML
    void mainMenuCustomerClick(ActionEvent event) throws IOException {

        Parent customerMenu = FXMLLoader.load(getClass().getResource("../views/customer.fxml"));
        Scene scene = new Scene(customerMenu);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     * This will take us to the reports screen.
     * @param event
     * @throws IOException
     */
    @FXML
    void mainMenuReportsClick(ActionEvent event) throws IOException {

        Parent reportMenu = FXMLLoader.load(getClass().getResource("../views/Reports.fxml"));
        Scene scene = new Scene(reportMenu);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     * This will close the application.
     * @param ExitButton
     */
    public void mainMenuExitClick(ActionEvent ExitButton) {
        Stage stage = (Stage) ((Node) ExitButton.getSource()).getScene().getWindow();
        stage.close();
    }

}
