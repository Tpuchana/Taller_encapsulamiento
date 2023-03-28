/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appfit;
import personas.Persona;
public class Ejercitar {
    
            //Atributos
    
    double tiempo;
    double calorias;
    double imc;
    Persona usuario;


        //Métodos
        //Constructor método 1
    
    public Ejercitar(Persona usuario){
        
        this.tiempo = 0;
        this.calorias = 0;
        this.usuario = usuario;
        this.imc = 0;
    }
    
    public Ejercitar(String nombre, int edad, double estatura, double peso){
        
        this.tiempo = 0;
        this.calorias = 0;
        this.usuario = new Persona(nombre, edad, estatura, peso);
        this.imc = 0;
    }

    public double IMC() {
        imc = this.usuario.getPeso()/(this.usuario.getEstatura()*this.usuario.getEstatura());
        return imc;
    }

    @Override
    public String toString() {
        return "Dhistórico del usuario \n" +
                "Tiempo total de ejercicio: " + tiempo + "minutos\n" 
                + "total calorias quemadas: " + calorias + "Cal";
    }
    
    
    
    
} 
