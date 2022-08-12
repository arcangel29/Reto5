package reto5feber.Modelo.DAO;
import java.sql.*;
import reto5feber.Utilidades.*;
public class Consulta1DAO {
    public static ResultSet consulta() {
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        String csql="SELECT ID_Lider,Nombre,Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
        try {
            conn=JDBCUtilities.conexion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
}
