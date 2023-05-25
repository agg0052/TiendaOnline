/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaonline;

/**
 * Representa un usuario en el sistema.
 *
 * @author Alejandro García
 * @version 1.0
 */
public class Usuario {

    // Atributos
    private String email;
    private String password;
    private String nombre;
    private String apellidos;
    private int telefono;

    /**
     * Constructor que permite crear un usuario proporcionando una serie de datos.
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @param nombre Nombre real del usuario.
     * @param apellidos Apellidos del usuario.
     * @param telefono Número de teléfono del usuario.
     */
    public Usuario(String email, String password, String nombre, String apellidos, int telefono) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    /**
     * Método que permite al usuario iniciar sesión en el sistema.
     * @param pass Contraseña del usuario.
     * @return Booleano que indica si ha sido posible o no iniciar sesión.
     */
    public boolean login(String pass) {
        if (pass.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que permite obtener el correo electrónico del usuario.
     * @return El correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que permite establecer el correo electrónico del usuario.
     * @param email El correo electrónico por el que queremos reemplazar el actual.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método que permite obtener la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Método que permite establecer la contraseña del usuario.
     * @param password La contraseña por la que queremos reemplazar la actual.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Método que permite obtener el nombre real del usuario.
     * @return El nombre real del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que permite establecer el nombre real del usuario.
     * @param nombre El nombre por el que queremos reemplazar el actual.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que permite obtener los apellidos del usuario.
     * @return Los apellidos del usuario.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método que permite establecer los apellidos del usuario.
     * @param apellidos Los apellidos por los que queremos reemplazar los actuales.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Método que permite obtener el número de teléfono del usuario.
     * @return El número de teléfono del usuario.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Método que permite establecer el número de teléfono del usuario.
     * @param telefono El número de teléfono por el que queremos reemplazar el actual.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
