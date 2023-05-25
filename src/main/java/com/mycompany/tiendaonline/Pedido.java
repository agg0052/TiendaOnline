/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaonline;

import java.util.ArrayList;

/**
 * Representa un pedido a la tienda.
 *
 * @author Alejandro García
 * @version 1.0
 */
public class Pedido {
    
    // Atributos
    private String idPedido;
    private ArrayList<Producto> productos;
    private double totalPedido;

    /**
     * Constructor que permite crear un pedido proporcionando una serie de datos. Genera automáticamente un ID de pedido utilizando
     * el número del cliente que lo realiza y el del propio pedido y calcula el importe sin IVA del mismo.
     * @param numCliente Número de cliente del usuario que realiza el pedido.
     * @param numPedido Número del pedido (se corresponde al índice que ocupará en la lista de pedidos del cliente más uno).
     * @param productos Lista con los productos del pedido.
     */
    public Pedido(int numCliente, int numPedido, ArrayList<Producto> productos) {
        this.productos = productos;
        idPedido = numCliente + "-" + numPedido;
        
        for (int i = 0; i < productos.size(); i++) {
            totalPedido+=productos.get(i).getPrecio();
        }
    }

    /**
     * Método que devuelve una ficha con los productos del pedido.
     * @return Devuelve datos de los productos del pedido.
     */
    @Override
    public String toString() {
        String listaProductos="";
        
        for (int i = 0; i < productos.size(); i++) {
            listaProductos+=productos.get(i).toString()+"\n";
        }
        
        return listaProductos;
    }

    /**
     * Método que permite obtener el ID del pedido.
     * @return El ID del pedido.
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * Método que permite establecer el ID del pedido.
     * @param idPedido El ID por el que queremos reemplazar el actual.
     */
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Método que permite obtener una lista con los productos del pedido.
     * @return La lista con los productos del pedido.
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * Método que permite establecer una lista con los productos del pedido.
     * @param productos La lista con los productos del pedido por la que queremos reemplazar la actual.
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /**
     * Método que permite obtener el importe total del pedido.
     * @return El importe total del pedido.
     */
    public double getTotalPedido() {
        return totalPedido;
    }

    /**
     * Método que permite establecer el importe total del pedido.
     * @param totalPedido El importe total del pedido por el que queremos reemplazar el actual.
     */
    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }
    
}
