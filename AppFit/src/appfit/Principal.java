/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appfit;
//Importamos clase 'persona'
import javax.swing.JOptionPane;
import personas.Persona;
/**
 *
 * @author SALA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        String nombre;
        int edad;
        double estatura, peso;
        JOptionPane.showMessageDialog(null, "Bienvenido a la App FIT");
        nombre      = JOptionPane.showInputDialog("Ingrese su nombre:");
        edad        = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:")); 
        estatura    = Double.parseDouble (JOptionPane.showInputDialog("Ingrese su estatura:"));
        peso        = Double.parseDouble (JOptionPane.showInputDialog("Ingrese su peso:"));
                //Integer.parseInt para pasar de Str a int
                //Double.parseDouble para pasar de Str a double
                
                
                
////App ejercitar método 1
//        
//        Persona usuario = new Persona(nombre, edad, estatura, peso);
//        Ejercitar appEjercitar = new Ejercitar(usuario);
    
        //App ejercitar método 2
        Ejercitar appEjercitar = new Ejercitar(nombre, edad, estatura, peso);
        JOptionPane.showMessageDialog(null, "Usuario FIT: \n" + appEjercitar.infoUsuario());
        JOptionPane.showMessageDialog(null, "Indice de masa corporal:\n"+appEjercitar.IMC());
        
    }
    
}
