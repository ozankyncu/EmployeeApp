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
public class MainViewController {
    private Main main;
    
    @FXML
    private void goHome() throws IOException{
       main.showMainItems();
    }
    @FXML
    private void addBtn() throws IOException{
        main.showAddStage();
    }
}
