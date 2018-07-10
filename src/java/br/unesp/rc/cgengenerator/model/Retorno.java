package br.unesp.rc.s4lsa.model;

public class Retorno {

    private String descricao;

    private Atendimento atendimentoRetorno;

    private Atendimento atendimento;

    public Retorno() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Atendimento getAtendimentoRetorno() {
        return atendimentoRetorno;
    }

    public void setAtendimentoRetorno(Atendimento atendimentoRetorno) {
        this.atendimentoRetorno = atendimentoRetorno;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    
}
