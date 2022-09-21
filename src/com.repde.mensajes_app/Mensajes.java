package com.repde.mensajes_app;

/**
 * Esta clase tendra la estructura basica pra poder realizarlas operaciones.
 *
 * @author John Alassio
 */
public class Mensajes {

    int id_mensjae;
    String mensaje;
    String autor_mensaje;
    String fecha_mensaje;

    public Mensajes() {

    }

    public Mensajes(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getId_mensjae() {
        return this.id_mensjae;
    }

    public void setId_mensjae(int id_mensjae) {
        this.id_mensjae = id_mensjae;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor_mensaje() {
        return this.autor_mensaje;
    }

    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    public String getFecha_mensaje() {
        return this.fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }

}
