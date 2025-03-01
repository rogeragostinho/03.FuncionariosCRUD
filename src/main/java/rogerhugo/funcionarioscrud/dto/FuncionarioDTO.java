/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rogerhugo.funcionarioscrud.dto;

import rogerhugo.funcionarioscrud.model.entity.Funcionario;

/**
 *
 * @author Róger Hugo
 */
public class FuncionarioDTO {
     private int id;
    private String nome;
    private int idade;

    private FuncionarioDTO( int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    
    public static FuncionarioDTO fromFuncionario(Funcionario funcionario) {
        return new FuncionarioDTO(funcionario.getId(), funcionario.getNome(), funcionario.getIdade());
    }
    
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
    
}
