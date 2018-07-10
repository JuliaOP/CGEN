package br.unesp.rc.cgengenerator.utils;

import java.sql.ResultSet;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class FabricaConexao implements IMySQL {

	private FabricaConexao() {

	}

	public static Connection getConexao() {
		return null;
	}

	public static void close(Connection con) {

	}

	public static void close(Connection con, PreparedStatement pstm) {

	}

	public static void close(Connection con, PreparedStatement pstm, ResultSet res) {

	}

}
