/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import Model.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Niko
 */
public class Controlador {
    private int n = 4;
    private int van = 0;
    private String Nombre="",Apellido="",Telefono="",Correo="";
    String datos[][] = new String[1000][4];
    String namescols[] = {"Nombre","Apellido","Telefono","Correo"};  
    private Menu menu;
    private Cadenas_Strings CadString;
    private CadenasView CadView;
    private CodeExplain CodeExp;
    private CondicionalView ConView;
    private Condicionales Condi;
    private Practicas Practices;
    private Vectores Vect;
    private VectoresView VectView;
    private Estructuras EstrucView;
    private Estructuras_De_Datos Estrucs;
    private codex Codex;
    private ListasView ListView;
    private ParesView ParView;
    private Listas_Pares listPares;
    
    
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
        this.menu.estructuras.addActionListener((ActionEvent e) -> {
            this.EstrucView = new Estructuras();   
            Estrucs = new Estructuras_De_Datos();
            menu.setVisible(false);
            EstrucView.setVisible(true);
            estructurasview();
        });  
        this.menu.listas.addActionListener((ActionEvent e) -> {
            this.ListView = new ListasView();   
            listPares = new Listas_Pares();
            menu.setVisible(false);
            ListView.setVisible(true);
            listas();
        });
        this.menu.Pares.addActionListener((ActionEvent e) -> {
            this.ParView = new ParesView();   
            listPares = new Listas_Pares();
            menu.setVisible(false);
            ParView.setVisible(true);
            pares();
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
    
    public void listas(){
        this.ListView.setTitle("Listas");
        this.ListView.setLocationRelativeTo(null);
        ListView.listas1.setText(listPares.Listas1());
        ListView.listas2.setText(listPares.Listas2());
        ListView.listas3.setText(listPares.Listas3());
        ListView.listas4.setText(listPares.Listas4());
        ListView.listas5.setText(listPares.Listas5());
        ListView.listas6.setText(listPares.Listas6());
        ListView.listas7.setText(listPares.Listas7());
        ListView.listas8.setText(listPares.Listas8());
        ListView.listas9.setText(listPares.Listas9());
        ListView.code.setText(listPares.EjeListas1());
        ListView.code2.setText(listPares.EjeListas2());
        ListView.code3.setText(listPares.EjeListas3());
        ListView.code4.setText(listPares.EjeListas4());
        ListView.code.setText(listPares.EjeListas5());
        ListView.code2.setText(listPares.EjeListas6());
        ListView.code3.setText(listPares.EjeListas7());
        ListView.code4.setText(listPares.EjeListas8());
        
        ListView.letsgo.addActionListener((ActionEvent e) -> {
            Practices = new Practicas();
            ListView.setVisible(false);
            practices();
        });
        ListView.menu.addActionListener((ActionEvent e) -> {
            ListView.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
    }
    
    public void pares(){
        this.ParView.setTitle("Pares");
        this.ParView.setLocationRelativeTo(null);
        ParView.paresview1.setText(listPares.Pares1());
        ParView.paresview2.setText(listPares.Pares2());
        ParView.paresview3.setText(listPares.Pares3());
        ParView.paresview4.setText(listPares.Pares4());
        ParView.paresview5.setText(listPares.Pares5());
        ParView.code.setText(listPares.EjePares1());
        ParView.code2.setText(listPares.EjePares2());
        ParView.code3.setText(listPares.EjePares3());
        ParView.code4.setText(listPares.EjePares4());
        ParView.run1.addActionListener((ActionEvent e) -> {
            ParView.verinfo1.setText(runCodePar(1));
        });
        ParView.run2.addActionListener((ActionEvent e) -> {
            ParView.verinfo2.setText(runCodePar(2));
        });  
        ParView.run3.addActionListener((ActionEvent e) -> {
            ParView.verinfo3.setText(runCodePar(3));
        }); 
        ParView.run4.addActionListener((ActionEvent e) -> {
            ParView.verinfo4.setText(runCodePar(4));
        }); 
        ParView.letsgo.addActionListener((ActionEvent e) -> {
            Practices = new Practicas();
            ParView.setVisible(false);
            practices();
        });
        ParView.menu.addActionListener((ActionEvent e) -> {
            ParView.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
    }
    
    public String runCodePar(int ns){
        String respuesta="",t,t2,t3;
        int n1 = 0,t1,t4=0;
        switch(ns){
            case 1:  
                try {
                    while(n1<3){
                        t = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        t2 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        t3 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        respuesta += t +" " + t2 + " " +t3 + "\n";
                        n1++;
                    }
                    respuesta = t4 + "\n";
                    ParView.verinfo1.setText(respuesta);
                } catch (HeadlessException e) {
                   JOptionPane.showMessageDialog(null, "error  data is not a number ");
                }
                break;
            case 2:  
                try {
                    while(n1<3){
                        t1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        t2 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        t3 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        t4+=t1;
                        n1++;
                    }
                    respuesta = t4 + "\n";
                    ParView.verinfo1.setText(respuesta);
                } catch (HeadlessException e) {
                   JOptionPane.showMessageDialog(null, "error  data is not a number ");
                }
                break;
            case 3:  
                try {
                    while(n1<2){
                        t2 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        t3 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        respuesta += t3 + "\n";
                        n1++;
                    }
                    
                    ParView.verinfo1.setText(respuesta);
                } catch (HeadlessException e) {
                   JOptionPane.showMessageDialog(null, "error  data  ");
                }
                break;
            case 4:  
                try {
                        t2 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        t3 = JOptionPane.showInputDialog("Ingrese cualquier dato");
                        respuesta = "Es par " + t2 + "\n" + t3 + "\n";                 
                    ParView.verinfo1.setText(respuesta);
                } catch (HeadlessException e) {
                   JOptionPane.showMessageDialog(null, "error  data ");
                }
                break;
            
        }
        return  respuesta;
    }
    
    public void estructurasview(){
        this.EstrucView.setTitle("Estructuras de datos");
        this.EstrucView.setLocationRelativeTo(null);
        EstrucView.questruct.setText(Estrucs.quees());
        EstrucView.defstruct.setText(Estrucs.defstruct());
        EstrucView.makestruc.setText(Estrucs.makestr());  
        EstrucView.code.setText(Estrucs.defeje());
        EstrucView.code2.setText(Estrucs.makeeje());     
        llenar_tabla(5); 
        EstrucView.run1.addActionListener((ActionEvent e) -> {
            EstrucView.verinfo1.setText(runCodestrcut(1));
        });
        EstrucView.run2.addActionListener((ActionEvent e) -> {
            EstrucView.verinfo2.setText(runCodestrcut(2));
        });   
        EstrucView.adddata.addActionListener((ActionEvent e) -> {
            addata();
        });
        EstrucView.seecode.addActionListener((ActionEvent e) -> {
            Codex = new codex();
            Codex.setVisible(true);
            SeeCode();
        });
        EstrucView.letsgo.addActionListener((ActionEvent e) -> {
            Practices = new Practicas();
            EstrucView.setVisible(false);
            practices();
        });
        EstrucView.menu.addActionListener((ActionEvent e) -> {
            EstrucView.setVisible(false);
            menu.setVisible(true);
            iniciar();
        });
    }
    
    public void SeeCode(){
        this.Codex.setTitle("Codigo");
        this.Codex.setLocationRelativeTo(null);
        String data =   ";Creamos la estructura para los clientes\n" +
                        "(define-struct Clinetes(nombre apellido telefono correo))\n" +
                        "\n" +
                        ";Le ingresamos datos a la estructura clientes\n" +
                        "(define dato (make-Clientes (read) (read) (read) (read)))";
        this.Codex.codes.setText(data);
        Codex.ok.addActionListener((ActionEvent e) -> {
            Codex.setVisible(false);
        });
    }
    
    public void addata(){
        this.n+=1;
            try {
                    this.Nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    this.Apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                    this.Telefono = JOptionPane.showInputDialog("Ingrese el telefono");
                    this.Correo = JOptionPane.showInputDialog("Ingrese el correo");
                    llenar_tabla(this.n-1);
                } catch (HeadlessException e) {
                   JOptionPane.showMessageDialog(null, "error empty field");
                }
    }
    
    public void llenar_tabla(int n){      
            datos[0][0]="Nicolas";
            datos[0][1]="Orozco";
            datos[0][2]="3114257895";
            datos[0][3]="nicolas@gmail.com";
            
            datos[1][0]="Laura";
            datos[1][1]="Gomez";
            datos[1][2]="3132452878";
            datos[1][3]="laura@gmail.com";
            
            datos[2][0]="Alejandro";
            datos[2][1]="Smith";
            datos[2][2]="3154856656";
            datos[2][3]="alejo@gmail.com";
            
            datos[3][0]="Sara";
            datos[3][1]="Miller";
            datos[3][2]="3208566027";
            datos[3][3]="sarita@gmail.com";
            
            datos[3][0]="Sofia";
            datos[3][1]="Nixon";
            datos[3][2]="3058856995";
            datos[3][3]="nixonsofia@gmail.com";
            
            datos[n][0]=this.Nombre;
            datos[n][1]=this.Apellido;
            datos[n][2]=this.Telefono;
            datos[n][3]=this.Correo;

        EstrucView.DatosStruct.setModel(new DefaultTableModel(datos,namescols));
    }
    
    public String runCodestrcut(int ns){
        int n1=0;
        String respuesta="",Nombre,Apellido,Telefono,Correo;
        switch(ns){
            case 1:  try {
                        respuesta = "Estructuras creadas exitosamente\nDoctores\nEnfermeros\nClinetes";
                        EstrucView.verinfo1.setText(respuesta);
                     } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "error empty field");
                     }
                break;
            case 2:  
                try {
                    while(n1<3){
                        Nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                        Apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                        Telefono = JOptionPane.showInputDialog("Ingrese el telefono");
                        Correo = JOptionPane.showInputDialog("Ingrese el direccion");
                        respuesta += Apellido + "\n";
                        n1++;
                    }
                    EstrucView.verinfo1.setText(respuesta);
                } catch (HeadlessException e) {
                   JOptionPane.showMessageDialog(null, "error empty field");
                }
                break;
        }
        return respuesta;
    }
    
    public void vectoresview(){
        this.VectView.setTitle("Vectores");
        this.VectView.setLocationRelativeTo(null);
        String respuesta;
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
        VectView.crear.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Cadena Creada");
        });
        VectView.mostrar.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null, "Datos: "+runCodevec(99)+"\n Tamaño: 4");
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
            case 99: respuesta =    VectView.v1.getText()+", "+
                                    VectView.v2.getText()+", "+
                                    VectView.v3.getText()+", "+
                                    VectView.v4.getText();
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
