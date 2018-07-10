/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.cgengenerator.dao;

import br.unesp.rc.cgengenerator.model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class EnderecoDAOImpl implements EnderecoDAO {

    public EnderecoDAOImpl() {
    }

    @Override
    public boolean salvar(Connection con, Endereco endereco, long idPessoa) throws SQLException {
        PreparedStatement pstm = null;
        boolean b = false;

        if (con != null) {
            pstm = con.prepareStatement(INSERT_ENDERECO);
            pstm.setString(1, endereco.getRua());
            pstm.setInt(2, endereco.getNumero());
            pstm.setString(3, endereco.getBairro());
            pstm.setString(4, endereco.getCidade());
            pstm.setString(5, endereco.getEstado());
            pstm.setString(6, endereco.getCep());
            pstm.setLong(8, idPessoa);
            pstm.executeUpdate();
            b = true;
        }

        return b;
    }

}
