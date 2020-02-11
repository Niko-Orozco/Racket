/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racket.study.tool;

import Controller.Controlador;
import View.Menu;

/**
 *
 * @author Niko
 */
public class RacketStudyTool {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        Controlador controller = new Controlador(menu);
        menu.setVisible(true);
        controller.iniciar();
    }
    
}
