/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.s4lsa.service;

import br.unesp.rc.s4lsa.dao.FabricaDAO;
import br.unesp.rc.s4lsa.dao.FuncionarioDAO;
import br.unesp.rc.s4lsa.model.Acesso;
import br.unesp.rc.s4lsa.model.Funcionario;

/**
 *
 * @author aluno
 */
public class FuncionarioSeviceImpl implements FuncionarioService {

    private FuncionarioDAO fdao;

    public FuncionarioSeviceImpl() {
        this.fdao = FabricaDAO.getFuncionarioDAO();
    }

    @Override
    public boolean salvar(Funcionario funcionario) {
        return this.fdao.salvar(funcionario);
    }

    @Override
    public boolean efetuarLogin(Funcionario funcionario) {
        boolean b = false;

        Acesso logado = this.fdao.efetuarLogin(funcionario);

        if (logado != null) {
            if (logado.equals(funcionario.getAcesso())) {
                b = true;
            }
        }

        return b;
    }

}
