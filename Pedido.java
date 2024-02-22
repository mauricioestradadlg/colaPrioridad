/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coladeprioridad;

/**
 *
 * @author ntact
 */

class Pedido implements Comparable<Pedido> {
    private Producto producto;
    private Cliente cliente;

    public Pedido(Producto producto, Cliente cliente) {
        this.producto = producto;
        this.cliente = cliente;
    }
    
     @Override
    public String toString() {
        return "\n\nPedido: \n\n{ Producto: " + producto + "\n Cliente: " + cliente + " \n}\n";
    }

    
   @Override
    public int compareTo(Pedido otro) {
        // Los pedidos de clientes con membresía premium tienen prioridad
        if (this.cliente.isMembresiaPremium() && !otro.cliente.isMembresiaPremium()) {
            return -1; // Este pedido tiene prioridad
        } else if (!this.cliente.isMembresiaPremium() && otro.cliente.isMembresiaPremium()) {
            return 1; // El otro pedido tiene prioridad
        }
        // Si ambos pedidos tienen la misma membresía o ninguno la tiene,
        // se pueden comparar por otros criterios, como el ID del cliente
        return Integer.compare(this.cliente.getId(), otro.cliente.getId());
    }
    

    // Otros métodos de la clase Pedido...

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

