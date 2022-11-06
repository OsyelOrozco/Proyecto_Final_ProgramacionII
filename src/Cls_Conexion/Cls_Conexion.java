
package Cls_Conexion;



    //PAQUETES NECESARIOS PARA LA CONEXION
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
    


//CONFIGURACION PARA LA CONEXION
public class Cls_Conexion {
    
    private static final String DRIVER   = "com.mysql.cj.jdbc.Driver";
    private static final String USER     = "root";      
    private static final String PASSWORD = "@Oooc14800";
    private static final String URL      = "jdbc:mysql://localhost:3306/bibloteca";
    private static Connection CN;
    private Connection getConnetion;
    public Statement sentencia;
    public ResultSet resultado;
    public Cls_Conexion(){
        CN = null;
    }
    
    
    //ESTABLECEMOS CONEXION CON LA BASE DE DATOS
    public static Connection getConnetion(){
        try{
            Class.forName(DRIVER);
            CN = DriverManager.getConnection(URL, USER, PASSWORD);
            //sentencia = getConnetion.createStatement();
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Conexion",JOptionPane.INFORMATION_MESSAGE );
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR AL CONECTAR A LA BASE DE DATOS",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return CN;
    }
    //CERRAMOS LA CONEXION
    public void close(){
        try{
            CN.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR AL CERRAR", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    
}
    

