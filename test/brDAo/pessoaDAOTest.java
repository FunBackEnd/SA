/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brDAo;

import brmodel.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author LUIZ
 */
public class pessoaDAOTest {
    Pessoa p ;
    public pessoaDAOTest() 
    {
        p = new Pessoa("Sandra","Professora");
       
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of consulta method, of class pessoaDAO.
     */
    @Test
    @Ignore
    public void testConsulta() {
        System.out.println("consulta");
        pessoaDAO instance = new pessoaDAO();
        //if(instance.consulta())
        //{
          //  System.out.println("Teste ok");    
        //}
        assertTrue(instance.consulta());
        
    }
   @Test
   @Ignore
   public void testInserir()
   {
       System.out.println("Inserir");
      pessoaDAO pd = new pessoaDAO();
       assertTrue(pd.inserir(p));
       
   }
   @Test
   @Ignore
   public void testUpdate()
   {
       System.out.println("Update");
       pessoaDAO pu = new pessoaDAO();
       Pessoa p1 = new Pessoa(2,"João","Arquiteto");
       assertTrue(pu.atualizar(p1)); 
   }
  @Test
  @Ignore
  public void testDelete()
  {
      System.out.println("Deletar");
      pessoaDAO pdd = new pessoaDAO();
      assertTrue(pdd.delete(5));
  }
 @Test
 public void testConsultaID()
 {
     System.out.println("ConsultaID");
     pessoaDAO pd5 = new pessoaDAO();
     assertTrue(pd5.consultaporId(7));
 }
    
}
