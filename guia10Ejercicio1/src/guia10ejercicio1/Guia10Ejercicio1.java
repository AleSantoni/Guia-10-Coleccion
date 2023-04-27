
package guia10ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *         Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.
 * @author BeluS
 */
public class Guia10Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ArrayList<String > perro=new ArrayList();
        
        do {
            System.out.println("Digite la raza del perro->");
            perro.add(leer.next());
            System.out.println("Desea cargar otro perro a la lista S/N");
            String opcion=leer.next();
            if(opcion.equalsIgnoreCase("n")){
                break;
            }
    
        } while (true);
        
     // mostramos el array
        System.out.println("La Lista de raza de perros es :");
     for(String aux: perro){
         System.out.println(aux);
     }
        
   
    }
    
}
