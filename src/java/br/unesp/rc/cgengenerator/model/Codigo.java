package br.unesp.rc.cgengenerator.model;

import java.util.Date;
import java.util.List;

public class Codigo {

	private Date dataCriacao;
	 private int identificador;
	private Pessoa pessoa;

		public Codigo() {

		}

		public Date getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(Date dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public int getIdentificador() {
			return identificador;
		}

		public void setIdentificador(int identificador) {
			this.identificador = identificador;
		}

		public Pessoa getPessoa() {
			return pessoa;
		}

		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}

}
