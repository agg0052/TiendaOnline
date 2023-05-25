/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaonline;

import java.time.LocalDate;

/**
 * Representa la factura de un pedido.
 *
 * @author Alejandro García
 * @version 1.0
 */
public class Factura {
    
    // Atributos
    private String idFactura;
    private String fechaFactura;
    private Pedido pedido;
    private double totalFactura;

    /**
     * Constructor que permite crear una factura proporcionando una serie de datos. Genera automáticamente un ID de factura utilizando
     * el número de la factura y el ID del pedido al que corresponde, asigna la fecha en que fue generada y calcula el importe total
     * con IVA.
     * @param numFactura Número de la factura (se corresponde al índice que ocupará en la lista de facturas del cliente más uno).
     * @param pedido Pedido al que corresponde la factura.
     */
    public Factura(int numFactura, Pedido pedido) {
        this.pedido = pedido;
        idFactura = pedido.getIdPedido() + "-" + numFactura;
        
        LocalDate fechaActual = LocalDate.now();
        fechaFactura = fechaActual.toString();
        
        totalFactura = pedido.getTotalPedido() * 1.21;
    }

    /**
     * Método que devuelve la factura.
     * @return Devuelve la factura en cuestión.
     */
    @Override
    public String toString() {
        return "FACTURA " + idFactura + "\nFecha de emisión: " + fechaFactura + "\n\n" + pedido + "\nTOTAL: " + pedido.getTotalPedido() + "€\nTOTAL CON IVA (21%): " + totalFactura + "€";
    }

    /**
     * Método que permite obtener el ID de la factura.
     * @return El ID de la factura.
     */
    public String getIdFactura() {
        return idFactura;
    }

    /**
     * Método que permite establecer el ID de la factura.
     * @param idFactura El ID de la factura por el que queremos reemplazar el actual.
     */
    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * Método que permite obtener la fecha de la factura.
     * @return La fecha de la factura.
     */
    public String getFechaFactura() {
        return fechaFactura;
    }

    /**
     * Método que permite establecer la fecha de la factura.
     * @param fechaFactura La fecha de la factura por la que queremos reemplazar la actual.
     */
    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    /**
     * Método que permite obtener el pedido al que corresponde la factura.
     * @return El pedido al que corresponde la factura.
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Método que permite establecer el pedido al que corresponde la factura.
     * @param pedido El pedido por el que queremos reemplazar el actual.
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * Método que permite obtener el importe total de la factura.
     * @return El importe total de la factura.
     */
    public double getTotalFactura() {
        return totalFactura;
    }

    /**
     * Método que permite establecer el importe total de la factura.
     * @param totalFactura El importe por el que queremos reemplazar el actual.
     */
    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }
    
}
