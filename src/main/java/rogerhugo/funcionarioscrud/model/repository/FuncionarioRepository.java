/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rogerhugo.funcionarioscrud.model.repository;

import rogerhugo.funcionarioscrud.model.entity.Funcionario;
/**
 *
 * @author Róger Hugo
 */
public class FuncionarioRepository {
    private Funcionario[] funcionarios;
    private int quantidade;
    
    {
        this.funcionarios = new Funcionario[10];
        this.quantidade = 0;
    }
    
    public Funcionario[] pegarTodos() {
        return this.funcionarios;
    }
    
    public Funcionario procurar(int id) {
        for(Funcionario funcionario: this.funcionarios)
            if(funcionario != null)
                if(funcionario.getId() == id)
                    return funcionario;
        return null;
    }
    
    public Funcionario salvar(Funcionario funcionario) {
        this.funcionarios[this.quantidade] = funcionario;
        return this.funcionarios[this.quantidade++];
    }
    
    public Funcionario remover(int id) {
        Funcionario funcionarioRemovido;
        for(Funcionario funcionario: this.funcionarios)
            if(funcionario != null)
                if(funcionario.getId() == id) {
                    funcionarioRemovido = funcionario;
                    funcionario = null;
                    return funcionarioRemovido;
                }
        return null;
    }
    
    public Funcionario alterar(Funcionario funcionarioAlterado) {
        for(Funcionario funcionario: this.funcionarios) {
            if(funcionario != null)
                if(funcionario.getId() == funcionarioAlterado.getId()){
                    funcionario = funcionarioAlterado;
                    return funcionario;
                }
        }
        return null;
    }
    
}
