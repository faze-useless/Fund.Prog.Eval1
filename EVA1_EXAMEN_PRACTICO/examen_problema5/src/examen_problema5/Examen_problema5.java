
package examen_problema5;
import java.util.*;

public class Examen_problema5 {

    public static void main(String[] args) {
        // Problema 5
        
        Scanner input = new Scanner(System.in);
        double grados= 45;
        double angulo_radianes;
        double gravedad = 9.81;
        double velocidad;
        double altura;
        double distancia;
        double coseno;
        double seno;
        
        System.out.println("Ingresa la velocidad inicial en m/s:");
        velocidad = input.nextDouble();
        //Math.toRadians es la conveción a radianes
        angulo_radianes = Math.toRadians(grados);
        //Math.pow es potencia
        //Math.sin es la función Seno
        seno = Math.sin(angulo_radianes);
        //formula h = Math.pow((v*seno(grados-radianes),2)/(2*gravedad)
        altura = ((Math.pow((velocidad*seno),2))) / (2 * gravedad);
        //Math.cos es la función Coseno
        coseno = Math.cos(angulo_radianes);
        //formula d = ((v*coseno(grados-radianes)*2*seno(grados-radianes))/gravedad 
        distancia = (coseno*2*seno)/gravedad;
        System.out.println("La altura maxima es: " + altura);
        System.out.println("La distancia que alcanza el objeto al caer es: " + distancia);
    }
    
}
