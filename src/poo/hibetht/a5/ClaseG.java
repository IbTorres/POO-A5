/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.hibetht.a5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristelhibeth
 */
public class ClaseG <T>{
//Atributos 
    List<T> list = new ArrayList<>(100);
    
    public ClaseG(){
        
    }
//Métodos públicos
   /**
     * Almacena el dato en la última posición disponible 
     * @param dato
     */
    public void almacenarUltimoDisponible(T dato){
        list.add(dato);
        System.out.println("Dato agregado");
    }
    /**
     * Almacena el dato en una posición determinada
     * @param p
     * @param dato 
     */
    public void almacenarEnPoisicion(int p, T dato){
       try {
            this.list.add(p, dato);
            System.out.println("Dato agregado");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Sobrelimita la extensión del arreglo");
        }
    }
    /**
     * Devolvemos todos los elementos del array
     * @return 
     */
    public List<T> devuelveAlmacenados(){
        return this.list;
    }
    /**
     * Devolvemos el primer elemento del array
     * @return 
     */
    public T devuelvePrimero() {
        return list.get(0);
    }
    /**
     * Devolvemos el último elemento del array
     * @return 
     */
    public T devuelveUltimoExistente() {
        return this.list.get(this.list.size() - 1);
    }
}