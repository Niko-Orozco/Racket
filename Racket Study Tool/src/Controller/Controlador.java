/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Niko
 */
public class Controlador {
    private int van = 0;
    private int van2 = 0;
    private Menu menu;
    private Cadenas_Strings CadString;
    private CodeExplain CodeExp;
    private CondicionalView ConView;
    private Condicionales Condi;
    private Practicas Practices;

    public Controlador(Menu menu) {
        this.menu = menu;
        this.menu.cadenas.addActionListener((ActionEvent e) -> {
            this.CadString = new Cadenas_Strings();
            menu.setVisible(false);
            CodeExp = new CodeExplain();
            CodeExp.setVisible(true);
            DoCode();
            cadenasview();
        });
        this.menu.condicionales.addActionListener((ActionEvent e) -> {
            Condi = new Condicionales();
            menu.setVisible(false);
            ConView = new CondicionalView();
            ConView.setVisible(true);
            NexCode();
            condicionlaesview();
        });
    }
    
    public void condicionlaesview(){
        this.ConView.setTitle("Logging");
        this.ConView.setLocationRelativeTo(null);
        ConView.ques.setText(Condi.Quees());
        ConView.bolerel.setText(Condi.bol());
        ConView.conif.setText(Condi.elif());
        ConView.concond.setText(Condi.elcond());
        NexCode();
        ConView.run1.addActionListener((ActionEvent e) -> {
            RConCode(1);
        });
        ConView.run2.addActionListener((ActionEvent e) -> {
            RConCode(2);
        });
        ConView.run3.addActionListener((ActionEvent e) -> {
            RConCode(3);
        });
        ConView.run4.addActionListener((ActionEvent e) -> {
            RConCode(4);
        });
        ConView.letsgo.addActionListener((ActionEvent e) -> {
            Practices = new Practicas();
            ConView.setVisible(false);
            practices();
        });
        ConView.menu.addActionListener((ActionEvent e) -> {
            ConView.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
    }
    
    public void RConCode(int van3){
        int n1,n2;
        String respuesta;
        switch(van3){
            case 1:  try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 1"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 2"));
                        respuesta = ((n1+n2)>10)? "Si es mayor que 10":"No es mayor que 10";
                        ConView.verinfo1.setText(respuesta);
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "error empty field");
                     }
                break;
            case 2:  try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 1"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 2"));
                        respuesta = ((n1+n2)>10)? (n1+n2)+", Si es mayor que 10": ((n1+n2)==10)? (n1+n2)+", Es igual que 10":(n1+n2)+", No es mayor que 10";
                        ConView.verinfo2.setText(respuesta);
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "error empty field");
                     }
                break;
            case 3:  try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 1"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 2"));
                        respuesta = ((n1+n2)>10)? "Es mayor que 10": ((n1+n2)==10)? "Es igual que 10":"Es menor que 10";
                        ConView.verinfo3.setText(respuesta);
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "error empty field");
                     }
                break;
            case 4:  try {
                        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 1"));
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor 2"));
                        respuesta = ((n1+n2)>10)? "Es mayor que 10": ((n1+n2)==10)? "Es igual que 10":"Es menor que 10";
                        ConView.verinfo4.setText(respuesta);
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "error empty field");
                     }
                break;
                    
        }
    }
    
    public void NexCode(){
        ConView.code.setText(Condi.EjeIf());
 
        ConView.code2.setText(Condi.EjeIfbegin());
  
        ConView.code3.setText(Condi.EjeCond());
 
        ConView.code4.setText(Condi.EjeCondbegin());
        
    }
    
    public void practices(){
        this.Practices.setVisible(true);
        this.Practices.setTitle("Practicas");
        this.Practices.setLocationRelativeTo(null);
        Practices.menu.addActionListener((ActionEvent e) -> {
            ConView.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
     
    }
    
    public void cadenasview(){
        this.CodeExp.setTitle("Logging");
        this.CodeExp.setLocationRelativeTo(null);
        /*CodeExp.vereje.addActionListener((ActionEvent e) -> {
            CodeExp.examples.setText(CadString.Ejercicios());
        });
        CodeExp.sigexample.addActionListener((ActionEvent e) ->{
            makeExamples();
        });
        CodeExp.salir.addActionListener((ActionEvent e) -> {
            CodeExp.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
        CodeExp.MoreCode.addActionListener((ActionEvent e) ->{
            DoCode();
        });
        CodeExp.RunCode.addActionListener((ActionEvent e) ->{
            runCode();
        });*/
    }
    
    public void runCode(){
        String respuesta = "",n1,n2,n3;
        switch(van2){
            case 1:  try {
                        n1 = (String)JOptionPane.showInputDialog("Ingrese el nombre");
                        n2 = (String)JOptionPane.showInputDialog("Ingrese primer Apellido");
                        n3 = (String)JOptionPane.showInputDialog("Ingrese segundo Apellido");
                        respuesta = n2.substring(0,3) + n3.substring(0,3) + n1.substring(0,3);
                        JOptionPane.showMessageDialog(null, respuesta);
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Code Error line 1 substring small string");
                     }
                break;
            default: String cad = (String)JOptionPane.showInputDialog("Ingrese la cadena");
                     cad = cad.replaceAll("[a,á,e,é,i,í,o,ó,u,ú]", "");
                     JOptionPane.showMessageDialog(null, cad);
                    
        }
    }
    
    public void DoCode(){
        van2++;
        /*switch(van2){
            case 1: CodeExp.outputs.setText(CadString.Ejemplos(van2));
                    break;
            default: CodeExp.outputs.setText(CadString.Ejemplos(van2));
                      van2 = (van2 >= 2)?van2 = 0:van2;   
        }*/
    }
    
    public void makeExamples(){
        van++;
        /*switch(van){
            case 1: CodeExp.examples.setText(CadString.IsString());
                    break;
            case 2: CodeExp.examples.setText(CadString.makeString());
                    break;
            case 3: CodeExp.examples.setText(CadString.lenght());
                    break;
            case 4: CodeExp.examples.setText(CadString.setSring());
                    break;
            default : CodeExp.examples.setText(CadString.Stringcmp());
                      van = (van >= 4)?van = 0:van;   
        }*/
    }
    
    public void iniciar() {
        this.menu.setTitle("Menu Dr. Racket");
        this.menu.setLocationRelativeTo(null);
    }
    
}
