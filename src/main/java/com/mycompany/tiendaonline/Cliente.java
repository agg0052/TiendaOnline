/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaonline;

import java.util.ArrayList;

/**
 * Representa un usuario de tipo cliente en el sistema.
 *
 * @author Alejandro García
 * @version 1.0
 */
public class Cliente extends Usuario {

    // Atributos
    private int numCliente;
    private boolean fidelizacion;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Factura> facturas;

    /**
     * Constructor que permite crear un usuario de tipo cliente proporcionando una serie de datos.
     * @param numCliente Número de cliente del usuario.
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @param nombre Nombre real del usuario.
     * @param apellidos Apellidos del usuario.
     * @param telefono Número de teléfono del usuario.
     */
    public Cliente(int numCliente, String email, String password, String nombre, String apellidos, int telefono) {
        super(email, password, nombre, apellidos, telefono);
        this.numCliente = numCliente;
        pedidos = new ArrayList<>();
        facturas = new ArrayList<>();
    }

    /**
     * Método que permite al cliente realizar un pedido. Efectúa el descuento correspondiente si el usuario pertenece al programa de fidelización,
     * procesa el pedido, genera la factura y, si el cliente no es miembro Plus, comprueba si tras este pedido cumple los requisitos.
     * @param pass Contraseña del usuario.
     * @param productos Lista con los productos a adquirir.
     * @throws Exception La excepción salta si la lista de productos está vacía o si el inicio de sesión falla.
     */
    public void hacerPedido(String pass, ArrayList<Producto> productos) throws Exception {
        boolean loggedIn = login(pass);
        
        if (loggedIn == true && productos.isEmpty() == false) {

            if (fidelizacion == true) {
                double valorCesta = 0;
                for (int i = 0; i < productos.size(); i++) {
                    valorCesta += productos.get(i).getPrecio();
                }
                productos.add(new Producto("Descuento por ser miembro Plus", -(valorCesta * 0.1)));
                System.out.println("Se ha aplicado correctamente el descuento del 10% por ser miembro Plus.");
            }

            pedidos.add(new Pedido(numCliente, pedidos.size() + 1, productos));
            System.out.println("Transacción realizada con éxito.");
            facturas.add(new Factura(facturas.size() + 1, pedidos.get(pedidos.size()-1)));
            System.out.println("El pedido " + pedidos.get(pedidos.size()-1).getIdPedido() + " ha sido procesado.");

            if (fidelizacion == false) {
                comprobarFidelizacion();
            }
        } else if (loggedIn == true && productos.isEmpty()) {
            throw new Exception("La cesta está vacía.");
        } else {
            throw new Exception("Login incorrecto.");
        }
    }

    /**
     * Método que permite al cliente consultar sus facturas. Muestra todas las facturas del cliente así como la suma del importe de todas.
     * @param pass Contraseña del usuario.
     * @throws Exception La excepción salta si la lista de facturas está vacía o si el inicio de sesión falla.
     */
    public void consultarFacturas(String pass) throws Exception {
        boolean loggedIn = login(pass);
        
        if (loggedIn == true && facturas.isEmpty() == false) {
            for (int i = 0; i < facturas.size(); i++) {
                System.out.println("\n\n"+facturas.get(i));
            }
            
            System.out.println("\n\nGASTO TOTAL: " + gastoTotal() + "€");
        } else if (loggedIn == true && facturas.isEmpty()) {
            System.out.println("No existen facturas disponibles.");
        } else {
            throw new Exception("Login incorrecto.");
        }
    }
    
    /**
     * Método que comprueba si un cliente cumple los requisitos del programa de fidelización.
     */
    public void comprobarFidelizacion() {
        if (fidelizacion == false && gastoTotal() > 200) {
            fidelizacion = true;
            System.out.println("¡Enhorabuena! Ha alcanzado el estatus de miembro Plus.");
        }
    }
    
    /**
     * Método que devuelve la suma del importe de todas las facturas del cliente.
     * @return Si existen facturas, devuelve la suma del importe de las mismas. En caso contrario, devuelve cero.
     */
    public double gastoTotal() {
        if (facturas.isEmpty() == false) {
            double suma = 0;
            for (int i = 0; i < facturas.size(); i++) {
                suma+=facturas.get(i).getTotalFactura();
            }
            return suma;
        } else {
            return 0;
        }
    }

    /**
     * Método que devuelve una ficha con datos personales del cliente.
     * @return Devuelve datos personales del cliente.
     */
    @Override
    public String toString() {
        String ficha = "Cliente nº" + numCliente;

        if (fidelizacion == true) {
            ficha += " (PLUS)";
        } else {
            ficha += " (ESTÁNDAR)";
        }

        ficha += "\n\nNombre: " + getNombre() + ' ' + getApellidos() + "\nEmail: " + getEmail() + "\nTeléfono: " + getTelefono();
        return ficha;
    }

    /**
     * Método que permite obtener el número de cliente del usuario.
     * @return El número de cliente del usuario.
     */
    public int getNumCliente() {
        return numCliente;
    }

    /**
     * Método que permite establecer el número de cliente del usuario.
     * @param numCliente El número de cliente por el que queremos reemplazar el actual.
     */
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * Método que permite saber si el usuario pertenece al programa de fidelización.
     * @return Booleano indicando la pertenencia del usuario al programa de fidelización.
     */
    public boolean isFidelizacion() {
        return fidelizacion;
    }

    /**
     * Método que permite establecer la pertenencia del usuario al programa de fidelización.
     * @param fidelizacion Booleano indicando la pertenencia del usuario al programa de fidelización por el que queremos reemplazar el actual.
     */
    public void setFidelizacion(boolean fidelizacion) {
        this.fidelizacion = fidelizacion;
    }

    /**
     * Método que permite obtener la lista con los pedidos del usuario.
     * @return La lista con los pedidos del usuario.
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * Método que permite establecer la lista con los pedidos del usuario.
     * @param pedidos La lista con los pedidos del usuario por la que queremos reemplazar la actual.
     */
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * Método que permite obtener la lista con las facturas del usuario.
     * @return La lista con las facturas del usuario.
     */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    /**
     * Método que permite establecer la lista con las facturas del usuario.
     * @param facturas La lista con las facturas del usuario del usuario por la que queremos reemplazar la actual.
     */
    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

}
