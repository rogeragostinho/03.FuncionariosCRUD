/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rogerhugo.funcionarioscrud;

import rogerhugo.funcionarioscrud.model.service.FuncionarioService;
import rogerhugo.funcionarioscrud.controller.FuncionarioController;
import rogerhugo.funcionarioscrud.view.FuncionarioView;

/**
 *
 * @author Róger Hugo
 */
public class App {
    public static void main(String[] args) {
        FuncionarioService service = new FuncionarioService();
        FuncionarioController controller = new FuncionarioController(service);
        FuncionarioView view = new FuncionarioView(controller);
        
        view.cadastrar("Roger", 20);
        view.cadastrar("Mari", 20);
        //view.verTodos();
        view.ver(1);
    }
}
