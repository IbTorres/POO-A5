package poo.hibetht.a5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cristelhibeth
 */
public class Persona {
    private String nombre;//Nombre
    private int edad;//Edad
    private char sexo;//Sexo
  
//Constructor
     /**
     * Constructor con 4 parametros
     * @param nombre nombre
     * @param edad edad 
     * @param sexo sexo
     */
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
//Métodos
    /**
     * Devuelve el nombre 
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }
 
    /**
     * Modifica el nombre 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     /**
     * Devuelve la edad 
     * @return edad 
     */
    public int getEdad() {
        return edad;
    }
 
    /**
     * Modifica la edad 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
     /**
     * Devuelve el sexo
     * @return sexo 
     */
    public char getSexo() {
        return sexo;
    }
 
    /**
     * Modifica el sexo
     * @param sexo
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}   