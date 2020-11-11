
package brDAo;

import brConexao.Conexao;
import brmodel.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class pessoaDAO 
{

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
            
     public boolean consulta()
     {
        String Sql = "Select * from pessoa";
            
            con = Conexao.conectar();
            
          try 
          {
           pst = con.prepareStatement(Sql);
           rs = pst.executeQuery();
              System.out.printf("%-5s|%-50s|%-20s\n", "ID", "Nome", "Profissao");
              while(rs.next())
              {
              System.out.printf("%-5s|%-50s|%-20s\n",rs.getInt(1),rs.getString(2),rs.getString(3));    
              }
              return true;
         } catch (Exception e) 
         {
             System.out.println("Não da");
             return false;
         }
     }
     
      public boolean inserir(Pessoa p)
  {
  String Sql = "insert into pessoa(nome,profissao) values (?,?)";

  con = Conexao.conectar();
      try 
      {
      pst = con.prepareStatement(Sql);
      pst.setString(1,p.getNome());
      pst.setString(2,p.getProfissao());
      pst.executeUpdate();
      System.out.println("Dados inseridos com sucesso");
      return true;
      } catch (Exception e) 
      {
          System.out.println("Erro");
          return false;
      }
  }
      
      public boolean atualizar(Pessoa pessoa)
      {
     String Sql = "UPDATE pessoa set nome = ?, profissao = ? where id = ?";
     con = Conexao.conectar();
          try 
          {
          pst = con.prepareStatement(Sql);
          pst.setString(1,pessoa.getNome());
          pst.setString(2,pessoa.getProfissao());
          pst.setInt(3,pessoa.getId());
          pst.executeUpdate();
              System.out.println("Atualizado com sucesso");
              return true;
          } catch (Exception e) 
          {
              System.out.println("Erro");
              return false;
          }
          
      }
      public boolean delete(int id)
      {
      String Sql = "DELETE from pessoa where id = ?";
      con = Conexao.conectar();
     
          try
          {
          pst = con.prepareStatement(Sql);
          pst.setInt(1, id);
          pst.executeUpdate();
       
          return true;
          } catch (Exception e) 
          {
              System.out.println("Erro");
              return false;
          }
      }
      
      public boolean consultaporId(int id)
{
String sql = "Select * from pessoa where id = ?";

con = Conexao.conectar();

try {
pst=con.prepareStatement(sql);
pst.setInt(1,id);
rs = pst.executeQuery();

System.out.printf("%-5s|%-50s|%-20s\n", "ID", "Nome", "Profissao");
while(rs.next())

{

System.out.printf("%-5s|%-50s|%-20s\n",rs.getInt(1), rs.getString(2), rs.getString(3));
}
return true;
} catch (Exception e) {
System.out.println("Não foi possível acessar os dados: "+e);
return false;
}finally{
Conexao.desconectar(con);
}
}
  
     
 
}
