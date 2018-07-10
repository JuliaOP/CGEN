package br.unesp.rc.cgengenerator.dao;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.unesp.rc.cgengenerator.model.Pessoa;



public interface PessoaDAO {

    final String INSERT_PESSOA
            = "INSERT INTO Pessoa(nome, dataNascimento, cpf, cnpj, "
            + "discriminador, telefoneResidencial, "
            + "telefoneComercial, celular, email) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public abstract long salvar(Connection con, Pessoa pessoa) throws SQLException;

}