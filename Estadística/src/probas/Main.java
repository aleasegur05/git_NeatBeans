/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probas;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {       
        System.out.print("\nCALCULOS ESTADISTICOS\n");
        Scanner teclado = new Scanner(System.in);
        boolean error;
        int m, n;        
        do {
            try {   
                error = false;
                System.out.println("Teclee m (>= 0): ");
                m = Integer.parseInt(teclado.nextLine());
                System.out.println("Teclee n (>= 0 y <= m): ");
                n = Integer.parseInt(teclado.nextLine());
                Estadisticos es = new Estadisticos(m, n);
		double factN=es.factorial(n);
                System.out.printf("Permutaciones(%d) = %f\n",n, factN);
		double factM=es.factorial(m);
                System.out.printf("Permutaciones(%d) = %f\n",m, factM);
                System.out.printf("Variaciones (%d,%d) = %f\n",m, n, es.variaciones());
                System.out.printf("Combinaciones(%d,%d) = %f\n",m, n, es.combinaciones());
                System.out.printf("Variaciones con repet.(%d,%d)= %f\n",m, n, es.variac_repet());
            } catch (Exception e) {
                System.out.println(e.getClass() + "->" + e.getMessage()); // Muestra el error
                error = true;
            }
        } while (error);
    }
    
}
