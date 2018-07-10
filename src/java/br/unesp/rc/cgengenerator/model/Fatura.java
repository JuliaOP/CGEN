package br.unesp.rc.s4lsa.model;

import java.util.List;

public class Fatura {

    private int identificador;

    private float total;

    private String metodoPagamento;

    private int numeroParcelas;

    private Atendimento atendimento;

    private List<ItemFatura> itemFatura;

    public Fatura() {

    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public List<ItemFatura> getItemFatura() {
        return itemFatura;
    }

    public void setItemFatura(List<ItemFatura> itemFatura) {
        this.itemFatura = itemFatura;
    }

}
