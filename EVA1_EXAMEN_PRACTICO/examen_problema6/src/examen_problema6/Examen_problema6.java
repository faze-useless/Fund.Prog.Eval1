package examen_problema6;

import java.util.*;

public class Examen_problema6 {

    public static void main(String[] args) {
        // Problema 6

        Scanner input = new Scanner(System.in);
        double vel_inicial;
        double vel_final;
        double tiempo_rotacion;
        double radio_rueda;
        double d_angular;
        double d_recorrida;
        double v_angular;
        double velocidad;
        double ace_angular;
        double aceleracion;
        double frecuencia;
        
        System.out.println("Ingrese la velocidad inicial angular (en radianes/s): ");
        vel_inicial = input.nextDouble();
        System.out.println("Ingrese la velocidad angular final (en radianes/s): ");
        vel_final = input.nextDouble();
        System.out.println("Ingrese y el tiempo de rotacion (en segundos): ");
        tiempo_rotacion = input.nextDouble();
        System.out.println("Ingrese el radio de la rueda en metros:");
        radio_rueda = input.nextDouble();
        d_angular = (vel_inicial + vel_final) * tiempo_rotacion / 2;
        d_recorrida = d_angular * radio_rueda;
        v_angular = d_angular / tiempo_rotacion;
        velocidad = d_recorrida / tiempo_rotacion;
        ace_angular = (vel_final - vel_inicial) / tiempo_rotacion;
        aceleracion = ace_angular * radio_rueda;
        frecuencia = 1 / tiempo_rotacion;
        
        System.out.println("La distancia angular recorrida es: " + d_angular);
        System.out.println("La distancia en metros recorrida es: " + d_recorrida);
        System.out.println("La velocidad angular promedio recorrida es: " + v_angular);
        System.out.println("La velocidad en m/s promedio recorrida es: " + velocidad);
        System.out.println("La aceleracion angular es: " + ace_angular);
        System.out.println("La acelearacion en m/s2 es: " + aceleracion);
        System.out.println("La frecuencia de giro (en Hertz) es:" + frecuencia);
    }

}
