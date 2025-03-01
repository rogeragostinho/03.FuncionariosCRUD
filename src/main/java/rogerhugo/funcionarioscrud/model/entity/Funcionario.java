/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rogerhugo.funcionarioscrud.model.entity;

/**
 *
 * @author Róger Hugo
 */
public class Funcionario {
    private int id;
    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Funcionario( int id, String nome, int idade) {
        this(nome, idade);
        this.id = id;
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

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
