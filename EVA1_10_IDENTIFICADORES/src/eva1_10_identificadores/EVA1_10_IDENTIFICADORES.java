
//Emiliano Cano Maro
package eva1_10_identificadores;

import java.util.*;

public class EVA1_10_IDENTIFICADORES {

    public static void main(String[] args) {
        //coso que hace cosas xd
        
        //int 1salario; <--- no cumple las reglas de identificadores: inicia con un numero
        
        //int salario&; <--- no cumple: & no es un caracter alfanumerico
        
        int mi_salario;
        int $salario; // <--- $ si es caracter valido en java
        int salario1000; // <--- los numeros son validos si no estan al inicio
        
        //int _; <--- no es valido el _ solo
        
        int $; // <--- valido
        
        //int mi salario; <--- java identifica aqui 2 identificadores
        int mi_sueldo; // <--- este si es valido
        
        int sueldo; // <---
        int Sueldo; // <---
        int SUELDO; // <--- todos estos son validos y diferentes
        
        //int mi_sueldo <--- no puedes repetir identificadores
        
        //int int; <--- no podemos repetir keywords
        
    }
    
}
