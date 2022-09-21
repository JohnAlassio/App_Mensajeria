package com.repde.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Vamos a conectar al proyecto java como aplicacion y el motor de base de datos
 * MySQL
 *
 * @author John Alassio
 */
public class Conexion {

    public Connection get_connection() {//etse metodo "get_connection" va a devolver un objeto de tipo "Connecton" asi que devemos agregar al final el "return" para retornar el objeto a la Base de Datos
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3308/mensajes_app", "root", "");

        } catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
}
