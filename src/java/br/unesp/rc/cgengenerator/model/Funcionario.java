package br.unesp.rc.s4lsa.model;

import java.util.List;

public class Funcionario extends Fisica {

    private Cargo cargo;

    private String loja;

    private long numeroMatricula;

    private List<Atendimento> atendimentoResgistrado;

    private List<Atendimento> atendimentoExecutado;

    private List<ItemAtendimento> desconto;

    private Acesso acesso;

    public Funcionario() {

    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public long getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(long numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public List<Atendimento> getAtendimentoResgistrado() {
        return atendimentoResgistrado;
    }

    public void setAtendimentoResgistrado(List<Atendimento> atendimentoResgistrado) {
        this.atendimentoResgistrado = atendimentoResgistrado;
    }

    public List<Atendimento> getAtendimentoExecutado() {
        return atendimentoExecutado;
    }

    public void setAtendimentoExecutado(List<Atendimento> atendimentoExecutado) {
        this.atendimentoExecutado = atendimentoExecutado;
    }

    public List<ItemAtendimento> getDesconto() {
        return desconto;
    }

    public void setDesconto(List<ItemAtendimento> desconto) {
        this.desconto = desconto;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }

}
