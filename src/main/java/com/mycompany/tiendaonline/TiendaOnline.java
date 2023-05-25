/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiendaonline;

import java.util.ArrayList;

/**
 *
 * @author AlejandroVM
 */
public class TiendaOnline {

    public static void main(String[] args) {
        Cliente cliente=new Cliente(1,"alejandro@gmail.com","1234","Alejandro","García",952999999);
        ArrayList<Producto> productos=new ArrayList<>();
        productos.add(new Producto("Teclado mecánico",80));
        productos.add(new Producto("Ratón ergonómico",50));
        
        try {
            cliente.hacerPedido("1234", productos);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Pedidos totales: " + cliente.getPedidos().size());
    }
}
