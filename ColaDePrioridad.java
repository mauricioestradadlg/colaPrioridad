/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladeprioridad;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ColaDePrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // ArrayList de productos con todas las instancias de las subclases
        ArrayList<Producto> listaProductos = new ArrayList<>();
        
        // Se asume que tienes instancias de clientes y productos
        
                PriorityQueue<Pedido> colaPrioridad = new PriorityQueue<>();

                // Agrega algunos pedidos a la cola de prioridad
                colaPrioridad.add(new Pedido(new Producto("Producto A", 999.99, 12345), new Cliente("Cliente 1", 1, true)));
                colaPrioridad.add(new Pedido(new Producto("Producto B", 999.99, 12345), new Cliente("Cliente 2", 2, false)));
                colaPrioridad.add(new Pedido(new Producto("Producto C", 999.99, 12345), new Cliente("Cliente 3", 3, true)));
                colaPrioridad.add(new Pedido(new Producto("Producto D", 999.99, 12345), new Cliente("Cliente 4", 2, false)));

        // Imprime la cola de prioridad
        while (!colaPrioridad.isEmpty()) {
            System.out.println(colaPrioridad.poll());
        }
        
        /*
        // Creamos una cola de prioridad de clientes
        PriorityQueue<Cliente> colaPrioridadClientes = new PriorityQueue<>();

        // Agregamos clientes a la cola de prioridad
        colaPrioridadClientes.add(new Cliente("Juan", 1, true));
        colaPrioridadClientes.add(new Cliente("María", 2, false));
        colaPrioridadClientes.add(new Cliente("Pedro", 3, true));

        // Mostramos la cola de prioridad de clientes
        System.out.println("Cola de prioridad de clientes: " + colaPrioridadClientes);
        
        
        // Creamos una cola de prioridad de números enteros
        PriorityQueue<Integer> colaPrioridad = new PriorityQueue<>();

        // Agregamos elementos a la cola de prioridad
        colaPrioridad.offer(5);
        colaPrioridad.offer(2);
        colaPrioridad.offer(8);
        colaPrioridad.offer(1);

        // Mostramos la cola de prioridad
        System.out.println("Cola de prioridad: " + colaPrioridad);
*/
    }


    }
    

