/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 *
 * @author ozankoyuncu
 */
public class AddNewEmployeeController {
    //Contact Information
    
    @FXML TextField nameField;
    @FXML TextField adressField;
    @FXML TextField cityField;
    @FXML TextField phoneField;
    @FXML TextField emailField;

    //Personal Information
    @FXML private DatePicker dateofBirth;
    @FXML private TextField ageField;
    
    @FXML
    private void showAge(){
        Calendar calendar= Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int birthYear = dateofBirth.getValue().getYear();
        int age= year - birthYear;
        ageField.setText(Integer.toString(age)+" Years");
        
    }
}
