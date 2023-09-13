package eva1_9_area_triangulo;

import java.util.*;

public class EVA1_9_AREA_TRIANGULO {

    public static void main(String[] args) {
        double area;
        double base;
        double altura;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introduzca la base: ");
        base = cap.nextDouble();
        System.out.println("Introduzca la altura: ");
        altura = cap.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.println("El area del triangulo es: "+area+"m²");
    }
    
}
