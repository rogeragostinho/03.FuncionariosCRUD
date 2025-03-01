/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rogerhugo.funcionarioscrud.model.service;

import rogerhugo.funcionarioscrud.model.repository.FuncionarioRepository;
import rogerhugo.funcionarioscrud.model.entity.Funcionario;
import rogerhugo.funcionarioscrud.dto.FuncionarioDTO;
/**
 *
 * @author Róger Hugo
 */
public class FuncionarioService {
    private FuncionarioRepository repositorio;
    
    {
        this.repositorio = new FuncionarioRepository();
    }
    
    public FuncionarioDTO cadastrarFuncionario(String nome, int idade) {
        Funcionario funcionario = new Funcionario(this.repositorio.pegarProximoId(), nome, idade);
        funcionario = this.repositorio.salvar(funcionario);
        return FuncionarioDTO.fromFuncionario(funcionario);
    }
    
    public FuncionarioDTO procurar(int id) {
        Funcionario funcionario = this.repositorio.procurar(id);
        return FuncionarioDTO.fromFuncionario(funcionario);
    }
    
    public FuncionarioDTO remover(int id) {
        Funcionario funcionario = this.repositorio.remover(id);
        return FuncionarioDTO.fromFuncionario(funcionario);
    }
    
    public FuncionarioDTO alterar(int id, String nome, int idade) {
        Funcionario funcionario = new Funcionario(id, nome, idade);
        funcionario = this.repositorio.alterar(funcionario);
        return FuncionarioDTO.fromFuncionario(funcionario);
    }
    
    public FuncionarioDTO[] pegarTodos() {
        Funcionario[] funcionarios = this.repositorio.pegarTodos();
        FuncionarioDTO[] funcionariosDTO = new FuncionarioDTO[funcionarios.length];
        
        for(int i = 0; i < funcionarios.length; i++)
            if(funcionarios[i] != null)
                funcionariosDTO[i] = FuncionarioDTO.fromFuncionario(funcionarios[i]);
        
        return funcionariosDTO;
    }
}
