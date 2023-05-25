/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tiendaonline;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author AlejandroVM
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void testHacerPedido() throws Exception {
        System.out.println("hacerPedido");
        String pass = "1234";
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Teclado mecánico",80));
        productos.add(new Producto("Ratón ergonómico",50));
        Cliente instance = new Cliente(1,"alejandro@gmail.com","1234","Alejandro","García",952999999);
        instance.hacerPedido(pass, productos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testConsultarFacturas() throws Exception {
        System.out.println("consultarFacturas");
        String pass = "1234";
        Cliente instance = new Cliente(1,"alejandro@gmail.com","1234","Alejandro","García",952999999);
        instance.consultarFacturas(pass);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testComprobarFidelizacion() {
        System.out.println("comprobarFidelizacion");
        Cliente instance = new Cliente(1,"alejandro@gmail.com","1234","Alejandro","García",952999999);
        instance.comprobarFidelizacion();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGastoTotal() {
        System.out.println("gastoTotal");
        Cliente instance = new Cliente(1,"alejandro@gmail.com","1234","Alejandro","García",952999999);
        double expResult = 0.0;
        double result = instance.gastoTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /*@Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNumCliente() {
        System.out.println("getNumCliente");
        Cliente instance = null;
        int expResult = 0;
        int result = instance.getNumCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNumCliente() {
        System.out.println("setNumCliente");
        int numCliente = 0;
        Cliente instance = null;
        instance.setNumCliente(numCliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsFidelizacion() {
        System.out.println("isFidelizacion");
        Cliente instance = null;
        boolean expResult = false;
        boolean result = instance.isFidelizacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFidelizacion() {
        System.out.println("setFidelizacion");
        boolean fidelizacion = false;
        Cliente instance = null;
        instance.setFidelizacion(fidelizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPedidos() {
        System.out.println("getPedidos");
        Cliente instance = null;
        ArrayList<Pedido> expResult = null;
        ArrayList<Pedido> result = instance.getPedidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPedidos() {
        System.out.println("setPedidos");
        ArrayList<Pedido> pedidos = null;
        Cliente instance = null;
        instance.setPedidos(pedidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Cliente instance = null;
        ArrayList<Factura> expResult = null;
        ArrayList<Factura> result = instance.getFacturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFacturas() {
        System.out.println("setFacturas");
        ArrayList<Factura> facturas = null;
        Cliente instance = null;
        instance.setFacturas(facturas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
