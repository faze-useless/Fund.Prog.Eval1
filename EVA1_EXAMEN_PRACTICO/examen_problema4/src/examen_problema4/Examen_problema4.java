
package examen_problema4;
import java.util.*;

public class Examen_problema4 {
    
    public static void main(String[] args) {
        // Problema 4
        Scanner input = new Scanner(System.in);
        
        double res1, res2, res3, res4, res5;
        double volt;
        double inte, inte1, inte2, inte3, inte4, inte5;
        double res_equ;
        
        System.out.print("Introduzca el voltaje (Voltios): ");
        volt = input.nextDouble();
        System.out.print("Introduzca la Resistencia 1 (Ohm): ");
        res1 = input.nextDouble();
        System.out.print("Introduzca la Resistencia 2 (Ohm): ");
        res2 = input.nextDouble();
        System.out.print("Introduzca la Resistencia 3 (Ohm): ");
        res3 = input.nextDouble();
        System.out.print("Introduzca la Resistencia 4 (Ohm): ");
        res4 = input.nextDouble();
        System.out.print("Introduzca la Resistencia 5 (Ohm): ");
        res5 = input.nextDouble();
        // el voltaje es igual en todas las resistencias
        res_equ = 1/((1/res1)+(1/res2)+(1/res3)+(1/res4)+(1/res5));
        inte = volt/res_equ;
        inte1 = volt/res1;
        inte2 = volt/res2;
        inte3 = volt/res3;
        inte4 = volt/res4;
        inte5 = volt/res5;
        
        System.out.println("La resistencia equivalente es: "+res_equ);
        System.out.println("La intensidad general es: "+inte+"A");
        System.out.println("La intensidad en cada circuito es: 1:("+inte1+"A), 2:("+inte2+"A), 3:("+inte3+"A), 4:("+inte4+"A), 5:("+inte5+"A)");
    }
    
}
