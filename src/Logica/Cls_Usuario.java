package Logica;
    import Cls_Conexion.Cls_Conexion;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;

public class Cls_Usuario {
    
    private final String SQL_INSERT = "INSERT INTO USUARIOS"
            + "(NOMBRE, APELLIDO,FECHA_DE_NACIMIENTO,GENERO,CORREO_ELECTRONICO,"
            + "CONTRASEÑA) "
            + "VALUES(?,?,?,?,?,?)";
    
    private PreparedStatement PS;
    private DefaultTableModel DT;

    private final Cls_Conexion CN;
    
    public Cls_Usuario(){
        PS = null;
        CN = new Cls_Conexion(); 
    }

    private DefaultTableModel setTitulos(){
        DT = new DefaultTableModel ();
        DT.addColumn("id_Usuarios");
        DT.addColumn("NOMBRE");
        DT.addColumn("APELLIDO");
        DT.addColumn("FECHA_DE_NACIMIENTO");
        DT.addColumn("GENERO");
        DT.addColumn("CORREO_ELECTRONICO");
        DT.addColumn("CONTRASEÑA");
        return DT;
    }
    

    public int insertDatos (String id_Usuarios,String NOMBRE, String APELLIDO,
            String FECHA_DE_NACIMIENTO,String GENERO,String CORREO_ELECTRONICO,
            String CONTRASEÑA){
        int res = 0;
        try{
            PS = CN.getConnetion().prepareStatement(SQL_INSERT);
            PS.setString(1,NOMBRE);
            PS.setString(2,APELLIDO);
            PS.setString(3,FECHA_DE_NACIMIENTO);
            PS.setString(4,GENERO);
            PS.setString(5,CORREO_ELECTRONICO);
            PS.setString(6,CONTRASEÑA);
            res = PS.executeUpdate();   
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Usuarario Creado");
                 
            }
            
        }catch(SQLException e){
            System.err.println("Error al crear Usuario" +e.getMessage());
        }finally{
            PS = null;
            CN.close();
        }
        
        return res;
    }

}    
    
