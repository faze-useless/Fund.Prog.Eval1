
package examen_problema3;
import java.util.*;

public class Examen_problema3 {

    public static void main(String[] args) {
        // Problema 3
        
        double radio,velo,area,flujo;
        Scanner cap =  new Scanner (System.in);
        
        System.out.println("Introduzca el radio de la tubería:");
        radio=cap.nextDouble();
        System.out.println("Introduzca el velocidad del flujo del agua:");
        
        velo=cap.nextDouble();
        area=(3.1416*(radio*radio));
        flujo=area*velo;
        
        System.out.println("La cantidad de agua que fluye es de: "+flujo+"m^3/");
    }
    
}
