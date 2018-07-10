package br.unesp.rc.cgengenerator.dao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.unesp.rc.cgengenerator.model.Codigo;
import br.unesp.rc.cgengenerator.model.Pessoa;

public interface CodigoDAO {

	public  String INSERT_CODIGO;

	public abstract boolean salvar(Codigo codigo);
}
