
package guia10ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada.
 * @author BeluS
 */
public class Guia10Ejercicio2 {

    
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
        // eliminamos un elemento del array con un Iterator
        System.out.println("Digite la raza del perro a eliminar de la lista ");
        String eliminar=leer.next();
        Iterator<String> it=perro.iterator();// creo un objeto iterator para eliminar en la lista  
        
        for (int i = 0; i < perro.size(); i++) {
            while(it.hasNext()){
                if(it.next().equalsIgnoreCase(eliminar)){
                    it.remove();
                }
            }
        }
            // mostramos el array
        System.out.println("La Lista de raza de perros es :");
        perro.forEach((aux) -> { // usamos el funcional Operation es lo mismo que la linea 37
            System.out.println(aux);
        });
    
}
}
    
    

