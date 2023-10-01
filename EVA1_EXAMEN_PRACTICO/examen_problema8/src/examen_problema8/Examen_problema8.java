/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_problema8;
import java.util.*;

public class Examen_problema8 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Problema 8
        
        System.out.println("Ingrese las coordenadas del centro (h, k): ");
        System.out.print("h = ");
        double h = scanner.nextDouble();
        System.out.print("k = ");
        double k = scanner.nextDouble();
        
        System.out.println("Ingrese los divisores (a y b): ");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        
        double c = Math.sqrt(a * a + b * b);
        
        double vertex1X = h + a;
        double vertex1Y = k;
        double vertex2X = h - a;
        double vertex2Y = k;
        
        double focus1X = h + c;
        double focus1Y = k;
        double focus2X = h - c;
        double focus2Y = k;
        
        System.out.println("Distancia del centro al foco (c) = " + c);
        System.out.println("Coordenadas de los vértices:");
        System.out.println("Vértice 1 (" + vertex1X + ", " + vertex1Y + ")");
        System.out.println("Vértice 2 (" + vertex2X + ", " + vertex2Y + ")");
        System.out.println("Coordenadas de los focos:");
        System.out.println("Foco 1 (" + focus1X + ", " + focus1Y + ")");
        System.out.println("Foco 2 (" + focus2X + ", " + focus2Y + ")");
    }
    
}
