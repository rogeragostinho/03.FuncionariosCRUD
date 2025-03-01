/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rogerhugo.funcionarioscrud.view;

import rogerhugo.funcionarioscrud.controller.FuncionarioController;  
import rogerhugo.funcionarioscrud.dto.FuncionarioDTO;

/**
 *
 * @author Róger Hugo
 */
public class FuncionarioView {
    private FuncionarioController controller;
    
    public FuncionarioView(FuncionarioController controller) {
        this.controller = controller;
    }
    
    public void cadastrar(String nome, int idade) {
        if(this.controller.cadastrarFuncionario(nome, idade) != null) {
            System.out.println("Funcionario cadastrado");
        }
    }
    
    public void ver(int id) {
        FuncionarioDTO funcionario = this.controller.procurar(id);
        if(funcionario != null) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Idade: " + funcionario.getIdade());
        }else
            System.out.println("Funcionario não encontrado");
    }
    
    public void verTodos() {
        FuncionarioDTO[] funcionarios = this.controller.pegarTodos();
        if(funcionarios != null){
            for(FuncionarioDTO funcionario: funcionarios) 
                if(funcionario != null) {
                    System.out.println("Id: " + funcionario.getId());
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Idade: " + funcionario.getIdade());
                    System.out.println("-----------------------");
                }
        }else
            System.out.println("Funcionarios não encontrados");
    }
    
    public void eliminar(int id) {
        if(this.controller.eliminar(id) != null)
            System.out.println("Funcionario eliminido");
        else
            System.out.println("Erro ao eliminar");
    }
    
    public void atualizar(int id, String nome, int idade) {
        if(this.controller.atualizar(id, nome, idade) != null)
            System.out.println("Funcionario atualizado");
        else
            System.out.println("Erro ao atualizar");
    }
            
}
