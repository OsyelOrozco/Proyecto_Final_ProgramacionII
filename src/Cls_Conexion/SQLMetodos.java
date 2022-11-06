package Cls_Conexion;

import Formularios.MenuPrincipal;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SQLMetodos {

    Connection Conexion;
    PreparedStatement sentencia;
    ResultSet resultado;
    String SQL;
    MenuPrincipal Menu = new MenuPrincipal();
    

    public void Iniciar_Sesion(String Correo_Electronico, String Contraseña) {

        try {

            Conexion = Cls_Conexion.getConnetion();
            SQL = "SELECT Correo_Electronico,Contraseña FROM Usuarios WHERE "
                    + "Correo_Electronico= '" + Correo_Electronico + "' && Contraseña = '" + Contraseña + "'";
            sentencia = Conexion.prepareStatement(SQL);
            resultado = sentencia.executeQuery();
            if (resultado.next()) {

                Correo_Electronico = resultado.getString("Correo_Electronico");
                Contraseña = resultado.getString("Contraseña");

                Menu.setVisible(true);

            } else {
                
                
                JOptionPane.showMessageDialog(null, "Correo o Contraseña Incorrecta" );
                
            }

        } catch (SQLException e) {
            System.out.println("Error" + e);

        }

    }
    

}
