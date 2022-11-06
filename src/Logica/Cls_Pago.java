
package Logica;

import Cls_Conexion.Cls_Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cls_Pago {
    
    private final String SQL_INSERT = "INSERT INTO PAGO"
            + "(NUMERO_DE_TARJETA, FECHA_EXPIRACION, CODIGO_SEGURIDAD,"
            + "NOMBRE_TITULAR,CORREO_ELECTRONICO)"
            + "VALUES(?,?,?,?,?)";
    
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private Cls_Conexion CN;
    
    public Cls_Pago(){
        PS = null;
        CN = new Cls_Conexion();
     
    }
    
    private DefaultTableModel setTitulos (){
        DT = new DefaultTableModel();
        DT.addColumn("NUMERO_DE_TARJETA");
        DT.addColumn("FECHA_EXPIRACION");
        DT.addColumn("CODIGO_SEGURIDAD");
        DT.addColumn("NOMBRE_TITULAR");
        DT.addColumn("CORREO_ELECTRONICO");
        return DT;
    }
    
    public int insetDatos (String NUMERO_DE_TARJETA, String FECHA_EXPIRACION, 
            String CODIGO_SEGURIDAD,String NOMBRE_TITULAR,
            String CORREO_ELECTRONICO){
        int res = 0;
        try{
            PS = CN.getConnetion().prepareStatement(SQL_INSERT);
            PS.setString(1, NUMERO_DE_TARJETA);
            PS.setString(2, FECHA_EXPIRACION);
            PS.setString(3, CODIGO_SEGURIDAD);
            PS.setString(4, NOMBRE_TITULAR);
            PS.setString(5, CORREO_ELECTRONICO);
            res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Contra Realizada");
                
            }
        } catch (SQLException e) {
            System.err.println("Error al realizar pago" +e.getMessage());
        }finally{
            PS = null;
            CN.close();
        }
        return res;
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
