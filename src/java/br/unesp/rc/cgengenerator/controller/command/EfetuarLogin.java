/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.s4lsa.controller.command;

import br.unesp.rc.s4lsa.model.Acesso;
import br.unesp.rc.s4lsa.model.Funcionario;
import br.unesp.rc.s4lsa.service.FabricaService;
import br.unesp.rc.s4lsa.service.FuncionarioService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
public class EfetuarLogin implements ICommand {

    public EfetuarLogin() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "";
        
        Funcionario funcionario = new Funcionario();
        Acesso acesso = new Acesso();
        acesso.setUsuario(request.getParameter("usuario"));        
        acesso.setSenha(request.getParameter("senha"));
        funcionario.setAcesso(acesso);
        
        FuncionarioService fs = FabricaService.getFuncionarioService();
        boolean b = fs.efetuarLogin(funcionario);
        
        if (b){
            page = "sistema.jsp";
        } else {
            page = "error.jsp";
        }
        
        return page;
    }
    
    
}
