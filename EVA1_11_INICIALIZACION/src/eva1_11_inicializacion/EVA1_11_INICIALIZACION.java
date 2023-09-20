
package eva1_11_inicializacion;

import java.util.*;

public class EVA1_11_INICIALIZACION {

    public static void main(String[] args) {
        //println() <---- Funcion
        //main() <---- Funcion
        
        System.out.println("Hola mundo");
        
        int valor = 0; //inicializar la variable para usarla
        System.out.println(valor);
        
        // declaramos e inicializamos 3 variables del mismo tipo
        double salario = 0, iva = 0.16, subtotal = 10000;
        
        final int CALIFA_PASAR = 70; // <---- constante
        final String ESCUELA = "Instituto Tecnológico de Chihuahua 2";
        
        System.out.println(ESCUELA);
        System.out.println("La califa mínima oara pasar es:");
        System.out.println(CALIFA_PASAR);
        
        /*
        TODO
        ESTE
        TEXTO
        ESTA
        SIENDO
        IGNORADO
        */
        
        byte valores = 120;
        //valores = 130;
        int mivalor = Integer.MAX_VALUE;
        System.out.println(mivalor+1);
    }
    
}
