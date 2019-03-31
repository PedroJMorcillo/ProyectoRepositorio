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
        System.out.print("¿Cómo te llamas? ");
        nombre = teclado.nextLine();
        System.out.print("Introduce un mensaje para empezar la práctica de repositorios:");
        mensaje = teclado.nextLine();
        System.out.println( nombre+ " te manda un mensaje: "+mensaje); 
        System.out.println( nombre+ " FIN DE LA PRIMERA PARTE ");
    }
    
}
