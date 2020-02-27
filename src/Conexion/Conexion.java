package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author castañosinning
 */
public class Conexion {
    public static Connection conexion;
    
    public static Connection getConexion(){
        try {
            if(conexion == null){
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cristo_rey", "root", "sol20tec19");
                System.out.println("Conexion Exitosa");
            }
            return conexion;
        } catch (ClassNotFoundException | SQLException ex) {
              throw new RuntimeException("conexion fallida", ex);
        }
    }
}
