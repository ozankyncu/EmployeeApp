/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.view;

import employee.Main;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author ozankoyuncu
 */
public class MainItemsController {
    private Main main;
    
    @FXML
    private void goElectrical() throws IOException{
        main.showElectricalScreen();
    }
    
    @FXML
    private void goMechanical() throws IOException{
        main.showMechanicalScreen();
    }
}
