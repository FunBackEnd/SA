/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brmodel;


public class Pessoa 
{
private int id;
private String nome;
private String profissao;

    public Pessoa(String nome, String profissao) {
   
        this.nome = nome;
        this.profissao = profissao;
    }

    public Pessoa(int id, String nome, String profissao) {
        this.id = id;
        this.nome = nome;
        this.profissao = profissao;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", profissao=" + profissao + '}';
    }
  
}
