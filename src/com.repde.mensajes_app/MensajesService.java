package com.repde.mensajes_app;

import java.util.Scanner;

/**
 * Esta clase es la capa media del menu principal y la capa de acceso
 *
 * @author John Alassio
 */
public class MensajesService {

    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();//el texto lo leemos en esta variable "mensaje"y sera igual al "sc.nextLine()" que es un metodo de la class Scanner, para permitirnos leer mensajes.

        System.out.println("Tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();//utilizaremos los metodos "set" de este Objeto registro para poder llenar los datos.
        registro.setMensaje(mensaje);
        registro.setEuto_mensaje(nombre);
        MensajesDAO.crearMensjaeDB(registro);

    }

    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();

    }

    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mesnaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);

    }

    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();

        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
