/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaonline;

/**
 * Representa un producto de la tienda.
 *
 * @author Alejandro García
 * @version 1.0
 */
public class Producto {
    
    // Atributos
    private String nombre;
    private double precio;

    /**
     * Constructor que permite crear un producto proporcionando una serie de datos.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Método que devuelve una ficha con datos del producto.
     * @return Devuelve datos del producto.
     */
    @Override
    public String toString() {
        return nombre + " - " + precio + '€';
    }

    /**
     * Método que permite obtener el nombre del producto.
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que permite establecer el nombre del producto.
     * @param nombre El nombre por el que queremos reemplazar el actual.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que permite obtener el precio del producto.
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que permite establecer el precio del producto.
     * @param precio El precio por el que queremos reemplazar el actual.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
