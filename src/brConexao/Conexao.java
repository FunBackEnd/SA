/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIZ
 */
public class Conexao {
  static final private String URL = "JDBC:mysql://localhost:3306/projetoDAO?useTimezone=true&serverTimezone=UTC";
 static final private String USER = "root";
  static final private String PASS = "!@#abc123";
    public static Connection conectar(){
    
    Connection con = null;
 
  
  try
  {
  con = DriverManager.getConnection(URL,USER,PASS);
  return con;
  }
  catch(SQLException e)
  {
   return null;   
  }
  
  }
    public static void desconectar(Connection con) 
  {
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null,"Erro"+e);
      }    
  }
}
