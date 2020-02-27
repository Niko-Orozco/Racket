package View;


import javax.swing.*;
import javax.swing.text.*;
import java.awt.Color;


public class CuadroTexto extends JTextPane {
    
   private JTextPane NewColor;

    public void setPrueva(JTextPane NewColor) {
        this.NewColor = NewColor;
    }

   public void append(Color c, String s) {
     StyleContext sc = StyleContext.getDefaultStyleContext();
     AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY,StyleConstants.Foreground, c);
   
     int len = NewColor.getDocument().getLength(); 
     NewColor.setCaretPosition(len); 
     NewColor.setCharacterAttributes(aset, false);
     NewColor.replaceSelection(s); 
   }   
}