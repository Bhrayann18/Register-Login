package com.usuariosjava.cortesoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Rol;
    private String Nombre;

    public Long getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(Long id_Rol) {
        this.id_Rol = id_Rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Rol(Long id_Rol, String nombre) {
        this.id_Rol = id_Rol;
        Nombre = nombre;
    }

    public Rol(String nombre) {
        Nombre = nombre;
    }

    public Rol() {
    }

}
