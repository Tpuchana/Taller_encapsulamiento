/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appfit;
import javax.swing.JOptionPane;
import personas.Persona;
public class Ejercitar {
    
            //Atributos
    
    double tiempo;
    double calorias;
    double imc;
    double calPeso;
    Persona usuario;


        //Métodos
        //Constructor método 1
    
    public Ejercitar(Persona usuario){
        
        this.tiempo = 0;
        this.calorias = 0;
        this.usuario = usuario;
        this.imc = 0;
        this.calPeso = 0;
    }
    
    public Ejercitar(String nombre, int edad, double estatura, double peso){
        
        this.tiempo = 0;
        this.calorias = 0;
        this.usuario = new Persona(nombre, edad, estatura, peso);
        this.imc = 0;
        this.calPeso = 0;
        
    }

    private void IMC() {
        imc = this.usuario.getPeso()/(this.usuario.getEstatura()*this.usuario.getEstatura());
        
    }
    private void perderPeso(){
        if(this.calPeso>=3500){      
    //Mala práctica            
    //this.usuario.setPeso(this.usuario.getPeso()-1);
    this.usuario.bajarPeso();
    this.calPeso=0;
    JOptionPane.showMessageDialog(null, "Felicidades, Has bajado 1 kg");
        }
    }
    
    private void correr(double distancia){
        double caloriasQuemadas= 1.03*this.usuario.getPeso()*distancia;
        this.calorias+=caloriasQuemadas;
        this.perderPeso();
        this.IMC();
        JOptionPane.showMessageDialog(null, "Corriendo...");
        
    }
    public void correr(double velocidad, double tiempo){
        double distancia = velocidad*tiempo/60;
        //recursividad
        this.correr(distancia);
        this.tiempo+=tiempo;
        
    }

    public double getImc() {
        return imc;
    }
    

    @Override
    public String toString() {
        return "Dhistórico del usuario \n" +
                "Tiempo total de ejercicio: " + tiempo + "minutos\n" 
                + "total calorias quemadas: " + calorias + "Cal";
    }
    public String infoUsuario(){
        return this.usuario.toString(); 
        
    }
    
    
    
    
} 
