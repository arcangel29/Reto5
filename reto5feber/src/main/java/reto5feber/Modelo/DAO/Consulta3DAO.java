package reto5feber.Modelo.DAO;
import java.sql.*;
import reto5feber.Utilidades.*;

public class Consulta3DAO {
    public static ResultSet consulta() {
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        String csql="SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto USING(ID_Proyecto) WHERE Proveedor=='Homecenter' AND Ciudad=='Salento';";
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
