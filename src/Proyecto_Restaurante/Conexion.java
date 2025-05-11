
package Proyecto_Restaurante;
import java.sql.*;

public class Conexion {
    static String url="jdbc:mysql://localhost:3306/restaurante";
    static String user="root";
    static String pass="";
    
    public static Connection conectar(){
        Connection con=null;
        try{
           con=DriverManager.getConnection(url, user,pass);
            System.out.println("Connección exitosa");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
