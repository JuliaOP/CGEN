package br.unesp.rc.s4lsa.model;

import java.util.Date;
import java.util.List;

public class Atendimento {

    private Date dataCriacao;

    private int validade;

    private StatusAtendimento status;

    private List<ItemAtendimento> itemAtendimento;

    private Pessoa pessoa;

    private Funcionario vendedor;

    private Fatura fatura;

    private List<Funcionario> mecanico;

    private List<Atendimento> retornoAtendimento;

    private Retorno retorno;

    public Atendimento() {

    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public StatusAtendimento getStatus() {
        return status;
    }

    public void setStatus(StatusAtendimento status) {
        this.status = status;
    }

    public List<ItemAtendimento> getItemAtendimento() {
        return itemAtendimento;
    }

    public void setItemAtendimento(List<ItemAtendimento> itemAtendimento) {
        this.itemAtendimento = itemAtendimento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public List<Funcionario> getMecanico() {
        return mecanico;
    }

    public void setMecanico(List<Funcionario> mecanico) {
        this.mecanico = mecanico;
    }

    public List<Atendimento> getRetornoAtendimento() {
        return retornoAtendimento;
    }

    public void setRetornoAtendimento(List<Atendimento> retornoAtendimento) {
        this.retornoAtendimento = retornoAtendimento;
    }

    public Retorno getRetorno() {
        return retorno;
    }

    public void setRetorno(Retorno retorno) {
        this.retorno = retorno;
    }

}
