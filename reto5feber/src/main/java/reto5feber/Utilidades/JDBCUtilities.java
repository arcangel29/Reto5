package reto5feber.Utilidades;
import java.sql.*;

public class JDBCUtilities {
    public static Connection conexion() {
        Connection conn=null;
        try {
            String url="jdbc:sqlite:ProyectosConstruccion.db";
            conn=DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}
