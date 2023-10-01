
package examen_problema2;
import java.util.*;

public class Examen_problema2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Problema 2
        
        double fahrenheit;
        double formula;

        System.out.println("Introduce los fahrenheit: ");
        fahrenheit = input.nextDouble();
        formula = ((fahrenheit - 32) / 1.8);
        System.out.println("Los centigrados son: "+formula+"°C");
    }
    
}
