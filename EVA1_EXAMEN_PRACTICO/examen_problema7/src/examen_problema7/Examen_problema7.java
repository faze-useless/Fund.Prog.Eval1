
package examen_problema7;
import java.util.*;

public class Examen_problema7 {
    
    public static void main(String[] args) {
        // Problema 7
        Scanner input = new Scanner(System.in);
        
        int x, x1, x2;
        int m;
        double area;
        
        System.out.print("Introduzca el valor de x para una Parábola = x^2: ");
        x = input.nextInt();
        
        // Parabola = x^2
        // Derivada = 2x
        m = 2*(x);
        System.out.println("La pendiente en este punto es: "+m);
        
        System.out.println("Para el área bajo la Parábola (x2 siempre debe ser mayor): ");
        System.out.print("Introduzca el valor de x1: ");
        x1 = input.nextInt();
        System.out.print("Introduzca el valor de x2: ");
        x2 = input.nextInt();
        
        // Integral = x^3/3
        
        area = ((Math.pow(x1,3))/3)+((Math.pow(x2,3))/3);
        System.out.println("El área debajo de la curva es: "+area+"u^2");
        
    }
    
}
