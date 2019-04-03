/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorepo;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class ProyectoRepo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, mensaje;
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cual es tu nombre? ");
        nombre = teclado.nextLine();
        System.out.print("Introduce un mensaje para empezar la práctica de repositorios:");
        mensaje = teclado.nextLine();
        System.out.println( nombre+ " te manda un mensaje: "+mensaje); 
        
       
        CCuenta c1 = new CCuenta();
        c1.ingresar(200);
    }
    
}
