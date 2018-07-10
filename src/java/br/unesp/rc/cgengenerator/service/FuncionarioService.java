/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.s4lsa.service;

import br.unesp.rc.s4lsa.model.Funcionario;

/**
 *
 * @author aluno
 */
public interface FuncionarioService {
    
    public boolean salvar(Funcionario funcionario);
    
    public boolean efetuarLogin(Funcionario funcionario);
}
