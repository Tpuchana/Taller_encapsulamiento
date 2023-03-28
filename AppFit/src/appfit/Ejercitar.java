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
    
    private void correr(double distancia){
        double caloriasQuemadas= 1.03*this.usuario.getPeso()*distancia;
        this.calorias+=caloriasQuemadas;
        
    }
    public void correr(double velocidad, double tiempo){
        double distancia = velocidad*tiempo/60;
        //recursividad
        this.correr(distancia);
        this.tiempo+=tiempo;
        
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
