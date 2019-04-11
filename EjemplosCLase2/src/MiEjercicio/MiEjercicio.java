/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiEjercicio;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class MiEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este metodo es el principal de mi proyecto
        // No olvidar ingresar valores
        
        String nombres; 
        String pais;
        int edad;
        int nota1;
        int nota2;
        int promedio;
        String ciudad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresar sus nombres y apellidos");
        nombres = entrada.nextLine();
        
        System.out.println("Por favor ingresar su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
         
        System.out.println("Por favor ingresar su Ciudad");
        ciudad = entrada.nextLine();
       
        
        System.out.println("Por favor ingresar su Pais");
        pais = entrada.nextLine();
        
        System.out.println("Por favor ingresar Notas ");
        nota1 = entrada.nextInt();
        nota2 = entrada.nextInt();
        
        promedio = (nota1+nota2)/2;
      
   System.out.printf("Sus nombres y Apellidos: %s\n Edad: %s\n Ciudad: %s\n "
           + "Pais:%S\n Notas:%s ,%s\n Promedio: %s" , nombres,  edad, ciudad, pais, 
           nota1, nota2, promedio );
    }
    
}
