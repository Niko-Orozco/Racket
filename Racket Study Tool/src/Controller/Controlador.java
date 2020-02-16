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
    private Menu menu;
    private Cadenas_Strings CadString;
    private CadenasView CadView;
    private CodeExplain CodeExp;
    private CondicionalView ConView;
    private Condicionales Condi;
    private Practicas Practices;
    private Vectores Vect;
    private VectoresView VectView;
    private Estructuras_De_Datos Estrucs;

    public Controlador(Menu menu) {
        this.menu = menu;
        this.menu.cadenas.addActionListener((ActionEvent e) -> {
            this.CadString = new Cadenas_Strings();
            menu.setVisible(false);
            CadView = new CadenasView();
            CadView.setVisible(true);
            cadenasview();
        });
        this.menu.vectores.addActionListener((ActionEvent e) -> {
            this.Vect = new Vectores();
            menu.setVisible(false);
            VectView = new VectoresView();
            VectView.setVisible(true);
            vectoresview();
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
    
    public void vectoresview(){
        this.VectView.setTitle("Logging");
        this.VectView.setLocationRelativeTo(null);
        VectView.quevect.setText(Vect.quevect());
        VectView.makevect.setText(Vect.makevect());
        VectView.vectref.setText(Vect.vectref());
        VectView.fillvect.setText(Vect.vectfill());
        VectView.setvect.setText(Vect.vectset());
        VectView.lenvect.setText(Vect.vectlen());
        VectView.code.setText(Vect.makeeje());
        VectView.code2.setText(Vect.refeje());
        VectView.code3.setText(Vect.seteje());
        VectView.code4.setText(Vect.filleje());
        VectView.code5.setText(Vect.leneje());   
        VectView.run1.addActionListener((ActionEvent e) -> {
            VectView.verinfo1.setText(runCodevec(1));
        });
        VectView.run2.addActionListener((ActionEvent e) -> {
            VectView.verinfo2.setText(runCodevec(2));
        });
        VectView.run3.addActionListener((ActionEvent e) -> {
            VectView.verinfo3.setText(runCodevec(3));
        });
        VectView.run4.addActionListener((ActionEvent e) -> {
            VectView.verinfo4.setText(runCodevec(4));
        });
        VectView.run5.addActionListener((ActionEvent e) -> {
            VectView.verinfo5.setText(runCodevec(5));
        });
        VectView.letsgo.addActionListener((ActionEvent e) -> {
            Practices = new Practicas();
            VectView.setVisible(false);
            practices();
        });
        VectView.menu.addActionListener((ActionEvent e) -> {
            VectView.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
    }
    
    public void condicionlaesview(){
        this.ConView.setTitle("Condicionales");
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
            Practices.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
     
    }
    
    public void cadenasview(){
        this.CadView.setTitle("Cadenas");
        this.CadView.setLocationRelativeTo(null);
        CadView.quecadena.setText(CadString.Ques());
        CadView.makecadena.setText(CadString.makeString());
        CadView.stringfuncion.setText(CadString.IsString());
        CadView.lenghtcadena.setText(CadString.lenght());
        CadView.setcadena.setText(CadString.setSring());
        CadView.strcomparar.setText(CadString.Stringcmp());
        CadView.caracdena.setText(CadString.stringref());
        CadView.cadunion.setText(CadString.unioncad());
        CadView.code.setText(CadString.makeseje());
        CadView.code2.setText(CadString.stringeje());
        CadView.code3.setText(CadString.lengtheje());
        CadView.code4.setText(CadString.appendeje());
        CadView.code5.setText(CadString.refeje());
        CadView.code6.setText(CadString.seteje());
        CadView.code7.setText(CadString.strincmpeje());
        CadView.run1.addActionListener((ActionEvent e) -> {
            CadView.verinfo1.setText(runCode(1));
        });
        CadView.run2.addActionListener((ActionEvent e) -> {
            CadView.verinfo2.setText(runCode(2));
        });
        CadView.run3.addActionListener((ActionEvent e) -> {
            CadView.verinfo3.setText(runCode(3));
        });
        CadView.run4.addActionListener((ActionEvent e) -> {
            CadView.verinfo4.setText(runCode(4));
        });
        CadView.run5.addActionListener((ActionEvent e) -> {
            CadView.verinfo5.setText(runCode(5));
        });
        CadView.run6.addActionListener((ActionEvent e) -> {
            CadView.verinfo6.setText(runCode(6));
        });
        CadView.run7.addActionListener((ActionEvent e) -> {
            CadView.verinfo7.setText(runCode(7));
        });
        CadView.letsgo.addActionListener((ActionEvent e) -> {
            Practices = new Practicas();
            CadView.setVisible(false);
            practices();
        });
        CadView.menu.addActionListener((ActionEvent e) -> {
            CadView.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
     
    }
    
    public String runCodevec(int van2){
        String respuesta = "",n1,n2,n3;
        int n,l=0,j=1;
        switch(van2){
            case 1: respuesta = "j,j,j,j,j"+"\n\n";
                break;
            case 2: respuesta = "34";
                break;
            case 3: respuesta = "q, ''Hola'', ''pollito'' #t";
                break;
            case 4: try {
                        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cadena 1"));
                        String abc = "abcdefghijklmnopqrstuvwxyz";
                        String[] datos = new String[n];
                        for(int i = 1; n >= 0; i++){
                            if((i >= 11)){
                                respuesta += abc.charAt(l)+ ", ";
                                if(abc.charAt(l) == 'z'){
                                    i=0;
                                }
                                l++;
                                j=1;
                                
                            }else{
                                respuesta += j + ", ";
                                j++;
                                l = 0;
                            }
                            n--;
                        }
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "code error");
                     }
                break;
            case 5:  respuesta = "Esto 0\n"+"Es 1\n"+"Un 2\n"+"Vector 3\n"+"Leido 4\n"+"Recursivamente 6";
                break;                   
        }
        return respuesta;
    }
    
    public String runCode(int van2){
        String respuesta = "",n1,n2,n3;
        int n;
        switch(van2){
            case 1: respuesta = "jjjj"+"\n\n"+"Hola que tal tu dia";
                break;
            case 2: try {
                        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cadena"));
                        respuesta = "No es una cadena";
                     } catch (Exception e) {
                        respuesta = "Si es una cadena";
                     }
                break;
            case 3: try {
                        n1 = (String)JOptionPane.showInputDialog("Ingrese la cadena");
                        respuesta = (n1.length() < 10)? "cadena de tamaño menor a diez":"cadena de tamaño mayor a diez.";
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ingrese solo texto");
                     }
                break;
            case 4: try {
                        n1 = (String)JOptionPane.showInputDialog("Ingrese la cadena 1");
                        n2 = (String)JOptionPane.showInputDialog("Ingrese la cadena 2");
                        respuesta = n1+n2;
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ingrese solo texto");
                     }
                break;
            case 5:  try {
                        n1 = (String)JOptionPane.showInputDialog("Ingrese el nombre");
                        n2 = (String)JOptionPane.showInputDialog("Ingrese primer Apellido");
                        n3 = (String)JOptionPane.showInputDialog("Ingrese segundo Apellido");
                        respuesta = n2.substring(0,3) + n3.substring(0,3) + n1.substring(0,3);
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Code Error line 1 substring small string");
                     }
                break;
            case 6: respuesta = "Es hora de zenar";
                break;
            case 7: try {
                        String cad = (String)JOptionPane.showInputDialog("Ingrese la cadena");
                        cad = cad.replaceAll("[a,á,e,é,i,í,o,ó,u,ú]", "");
                        respuesta = cad;
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ingrese solo texto");
                     }
                break;
                    
        }
        return respuesta;
    }
    
    public void iniciar() {
        this.menu.setTitle("Menu Dr. Racket");
        this.menu.setLocationRelativeTo(null);
    }
    
}
