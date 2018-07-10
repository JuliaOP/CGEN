package br.unesp.rc.s4lsa.model;

public enum StatusAtendimento {

    ORCAMENTO(1), COMPRA(2);

    private int statusAtendimento;

    private StatusAtendimento(int statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }

    public int getStatusAtendimento() {
        return statusAtendimento;
    }

    public void setStatusAtendimento(int statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }

}
