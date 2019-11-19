
package queuelinkedlist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author efren
 */
public class QueueLinkedList {

    public static void main(String[] args) {
      //insertar datos
      //retorna una exception en caso de no almacenar un elemento
        Queue<String> queue = new LinkedList();
        System.out.println(queue.add("Adrian"));
        System.out.println(queue.add("Jesus"));
        System.out.println(queue.add("Daniel"));
        //almacena null si no puede almacenar el elemento
        System.out.println(queue.offer("Francisco"));
        
        //eliminar
        System.out.println(queue.remove());
        //retornar
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
    
}
