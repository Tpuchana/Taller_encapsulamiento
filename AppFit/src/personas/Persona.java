/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author SALA
 */
public class Persona {
    //Atributos
    
            //final --> declarar constantes
    private final String nombre;
    private int edad;
    private final double estatura;
    private double peso;
    
    //Método constructor

    public Persona(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Datos Personales \n"
                + "Nombre: " + nombre +
                "\n Edad: " + edad +
                "\n Estatura: " + estatura +
                "\n Peso: " + peso;
    }
    
    
    
}
