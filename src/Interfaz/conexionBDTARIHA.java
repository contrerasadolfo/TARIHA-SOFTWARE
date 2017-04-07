package Interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexionBDTARIHA {
    
    String db="tariha";
    String user="root";
    String pass="clave";
    String url="jdbc:mysql://localhost:3307/"+db;
    Connection Conn;
  
     //   Connection cn; //declaracion de variable
        Statement st;
        
        public Connection conexion(){

        try{
           Class.forName("com.mysql.jdbc.Driver");
           Conn=DriverManager.getConnection(url,user,pass);

        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
        return Conn;
    }       
           
        /*public Connection conexion(){
            
            try {
                Class.forName("com.mysql.jdvc.Driver");
                cn = DriverManager.getConnection("jdbc:mysql://localhost:8080/sistema","root", "987654321");
                System.out.println("Conectado");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
                                  
            return cn;
            
        }
        
        Statement createStatement(){
        throw new UnsupportedOperationException("No Soportado");
        }*/
}