package com.repde.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DAO significa Data Access Outyet, esto es basicamente los metodos que nos van
 * a permitir los metodos con la base de datos La capa de servicios se encargara
 * de pedirle a la capa DAO que le solicite a la BD todos los mensajes que
 * tenemos en nuestra tabla mensajes. mensajesBD > DAO > Service > Inicio > "ver
 * mensajes"
 *
 * @author John Alassio
 */
public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();

        try ( Connection conexion = db_connect.get_connection()) {//vamos a crear otro try para la insercion de los datos
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("mensaje creado");

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void leerMensajesDB() {
        Conexion db_connect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try ( Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();//este metodo ejecuta la consulta pero es diferente al "executeUpdate" ya que este metodo no tiene transaccion de datos, solo los pide y no estamos editando, insertando o borrando elementos de la base de datos.

            while (rs.next()) {
                System.out.println("ID: " + rs.setInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Author: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

















    
    public static void borrarMensajeDB(int id_mensaje) {
        Conexion db_connect = new Conexion();

        try ( Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("el mensaje ha sido borrado");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("no se pudo borrar el mensaje");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();

        try ( Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensjae());
                ps.setInt(2, mensaje.getId_mensaje());
                ps.executeUpdate();
                System.out.println("el mensaje se actualizo correctamente");
            } catch (SQLException ex) {
                System.out.println(ex);
                System.out.println("no se pudo actualizar el mensaje");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
