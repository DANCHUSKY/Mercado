/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercado;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Mercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("primer commit");
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número: ");

        // Leer el número ingresado por el usuario
        int numero = scanner.nextInt();

        System.out.println(numero);

        // Cerrar el objeto Scanner después de su uso
        scanner.close();
    }
    
}
