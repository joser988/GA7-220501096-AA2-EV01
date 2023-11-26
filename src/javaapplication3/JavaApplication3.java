/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author IA Technologies
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
         
         String usuario="root";
         String password="";
         String url="jdbc:mysql://localhost:3306/ficha2626993";
         Connection conexion=null;
         Statement statement;
         ResultSet rs= null;
         
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        try {
            conexion=DriverManager.getConnection(url,usuario,password);
                statement=conexion.createStatement();
                statement.executeUpdate("insert into aprendiz value ('20','Juan','Arbelaez','Calle33','3333','juan@yahoo.es','2') ");
                rs=statement.executeQuery("select * from aprendiz");
                JOptionPane.showMessageDialog(null,"Datos guardados con exito");
                rs.next();
                do{
                    System.out.println(rs.getInt("identificacion")+":"+rs.getString("nombre"));
                }while(rs.next());
                        
                        
        } catch (SQLException ex) {
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
}
