/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.cgengenerator.dao;

import br.unesp.rc.cgengenerator.model.Endereco;
import java.sql.Connection;
import java.sql.SQLException;



public interface EnderecoDAO {
    
    final String INSERT_ENDERECO = 
    "INSERT INTO Endereco(rua, numero, bairro, cidade, "
            + "estado, cep, Pessoa_idPessoa) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?)";
    
    public abstract boolean salvar(Connection con, Endereco endereco, long idPessoa) throws SQLException;
    
}
