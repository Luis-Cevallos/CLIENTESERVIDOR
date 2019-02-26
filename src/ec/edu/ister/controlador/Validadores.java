/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Carvajal y Luis Cevallos
 */
public class Validadores {
    public void numerico(java.awt.event.KeyEvent evt) { 
        char c=evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();{}
    }
    public void alfabetico(java.awt.event.KeyEvent evt) { 
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z')&&(c<'A' || c>'Z')&&(c<' ' || c>' ' )) evt.consume(); {}
    }
//    public boolean camposObligatorios(String cedulaPol,String nombresPol,String apellidoPol,String direccionPol, String telefonoPol){
//        String blanco="";
//        if (cedulaPol.equals(blanco) || nombresPol.equals(blanco) || apellidoPol.equals(blanco) || direccionPol.equals(blanco) || telefonoPol.equals(blanco)) {
//            JOptionPane.showMessageDialog(null,"No puden existir campos en blanco");
//            return true;
//        }else{
//            return false;
//        }
//    }
}
