package br.unesp.rc.s4lsa.model;

import java.util.Date;

public abstract class Produto {

    private String codigo;

    private String nome;

    private float precoVenda;

    private Date garantia;

    private ItemAtendimento itemAtendimento;

    public Produto() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }

    public ItemAtendimento getItemAtendimento() {
        return itemAtendimento;
    }

    public void setItemAtendimento(ItemAtendimento itemAtendimento) {
        this.itemAtendimento = itemAtendimento;
    }

    
}
