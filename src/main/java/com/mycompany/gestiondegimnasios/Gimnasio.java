/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondegimnasios;

/**
 *
 * @author jd
 */
public class Gimnasio {
    public String Nombre;
    public String Direccion;
    public String Sucursal;
    public String Telefono;
    public String Email;

    public Gimnasio(String Nombre, String Direccion, String Sucursal, String Telefono, String Email) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Sucursal = Sucursal;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    

    
}
