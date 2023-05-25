/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaonline;

/**
 * Representa un usuario de tipo empleado en el sistema.
 *
 * @author Alejandro García
 * @version 1.0
 */
public class Empleado extends Usuario {

    // Atributos
    private int numEmpleado;
    private double salario;

    /**
     * Constructor que permite crear un usuario de tipo empleado proporcionando una serie de datos.
     * @param numEmpleado Número de empleado del usuario.
     * @param salario Salario del usuario.
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @param nombre Nombre real del usuario.
     * @param apellidos Apellidos del usuario.
     * @param telefono Número de teléfono del usuario.
     */
    public Empleado(int numEmpleado, double salario, String email, String password, String nombre, String apellidos, int telefono) {
        super(email, password, nombre, apellidos, telefono);
        this.numEmpleado = numEmpleado;
        this.salario = salario;
    }

    /**
     * Método que permite al empleado ver una ficha con datos personales de un cliente.
     * @param pass Contraseña del usuario.
     * @param cliente Cliente del cual queremos obtener la ficha.
     * @throws Exception La excepción salta si el inicio de sesión falla.
     */
    public void verFichaCliente(String pass, Cliente cliente) throws Exception {
        boolean loggedIn = login(pass);

        if (loggedIn == true) {
            System.out.println(cliente);
        } else {
            throw new Exception("Login incorrecto.");
        }
    }

    /**
     * Método que permite obtener el número de empleado del usuario.
     * @return El número de empleado del usuario.
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Método que permite establecer el número de empleado del usuario.
     * @param numEmpleado El número de empleado por el que queremos reemplazar el actual.
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Método que permite obtener el salario del usuario.
     * @return El salario del usuario.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Método que permite establecer el salario del usuario.
     * @param salario El salario por el que queremos reemplazar el actual.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
