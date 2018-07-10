package br.unesp.rc.cgengenerator.model;

import java.util.List;

public abstract class Pessoa {

	private String nome;

	private List<Endereco> endereco;

	private Contato contato;

	private List<Codigo> codigo;

	public Pessoa() {

	}

}
