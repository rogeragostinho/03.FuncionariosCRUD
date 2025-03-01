/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rogerhugo.funcionarioscrud.controller;

import rogerhugo.funcionarioscrud.model.service.FuncionarioService;
import rogerhugo.funcionarioscrud.model.entity.Funcionario;
import rogerhugo.funcionarioscrud.dto.FuncionarioDTO;

/**
 *
 * @author Róger Hugo
 */
public class FuncionarioController {
    private FuncionarioService service;
    
    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }
    
    public FuncionarioDTO cadastrarFuncionario(String nome, int idade) {
        return this.service.cadastrarFuncionario(nome, idade);
    }
    
    public FuncionarioDTO procurar(int id) {
        return this.service.procurar(id);
    }
    
    public FuncionarioDTO[] pegarTodos() {
        return this.service.pegarTodos();
    }
    
    public FuncionarioDTO eliminar(int id) {
        return this.service.remover(id);
    }
    
    public FuncionarioDTO atualizar(int id, String nome, int idade) {
        return this.service.alterar(id, nome, idade);
    }
}
