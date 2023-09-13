package eva1_6_entradas_salidas;

import java.util.*;

public class EVA1_6_ENTRADAS_SALIDAS {

    public static void main(String[] args) {
        String marca;
        String modelo;
        int year;
        double precio;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la marca del vehiculo: ");
        marca = input.nextLine();
        System.out.println("Ingrese el modelo del vehiculo: ");
        modelo = input.nextLine();
        System.out.println("Ingrese el año del vehiculo: (ej: 2005) ");
        year = input.nextInt();
        System.out.println("Ingrese del precio del vehiculo: w ");
        precio = input.nextDouble();
        
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
    
}
