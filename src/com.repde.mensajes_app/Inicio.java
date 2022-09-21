package com.repde.mensajes_app;

import java.util.Scanner;

/**
 * esta clase es para validar si efectivamente podemos conectarnos a la clase de
 * Base de Datos.
 *
 * @Author John Alassio.
 */
public class Inicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("--------------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. borrar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario;
            opcion = sc.nextInt();//y esto es lo que nos permite leer desde el teclado y guardarla en la variable opcion.
//y con un switch le decimos que dependiendo de la opcion que el usuario escoja, se va a ir a "la capa service" para poder hacer cualquiera de las 4 opraciones. y evalue la variable "opcion"
            switch (opcion) {
                case 1:
                    mensajeService.crearMensaje();
                    break;
                case 2:
                    mensajeService.listarMensajes();
                    break;
                case 3:
                    mensajeService.borrarMensaje();
                    break;
                case 4:
                    mensajeService.editarMensaje();
                    break;
                default:
                    mensajesService.salir();
                    break;
            }

        } while (opcion != 5);

    }
}
