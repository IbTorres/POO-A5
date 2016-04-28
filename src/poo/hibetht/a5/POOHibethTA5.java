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
public class POOHibethTA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List<ClaseG> list = new ArrayList<>(100);
    //T pasa a ser int
        ClaseG<Integer> c1 = new ClaseG<Integer>();
        c1.almacenarUltimoDisponible(100);
        c1.almacenarUltimoDisponible(50);
        c1.almacenarUltimoDisponible(2000);
        System.out.println(c1.devuelveAlmacenados());
        System.out.println("");
        
    //T pasa a ser string
        ClaseG<String> c2 = new ClaseG<String>();
        c2.almacenarUltimoDisponible("Hola");
        c2.almacenarUltimoDisponible("mundo");
        c2.almacenarUltimoDisponible("POO");
        System.out.println(c2.devuelveAlmacenados());
        System.out.println("");
        
    //T pasa a ser float
        ClaseG<Float> c3 = new ClaseG<Float>();
        c3.almacenarUltimoDisponible(1.151412f);
        c3.almacenarUltimoDisponible(1.0000f);
        c3.almacenarUltimoDisponible(3.1416f);
        System.out.println(c3.devuelveAlmacenados());
        System.out.println("");
        
    //T pasa a ser Personas
        ClaseG<Persona> c4 = new ClaseG<Persona>();
        Persona p1 = new Persona("Alison", 12, 'f');
        Persona p2 = new Persona("Sofía", 19, 'f');
        c4.almacenarUltimoDisponible(p1);
        c4.almacenarUltimoDisponible(p2);
        List<Persona> t = new ArrayList();
        t = c4.devuelveAlmacenados();
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i).getNombre() + ", " + t.get(i).getSexo() + ", " + t.get(i).getEdad());
        }
        System.out.println("");
    }
    
}