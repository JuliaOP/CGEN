package br.unesp.rc.s4lsa.model;

public class Desconto {

    private float descontoConcedido;

    private ItemAtendimento itemAtendimento;

    private Funcionario gerente;

    public Desconto() {

    }

    public float getDescontoConcedido() {
        return descontoConcedido;
    }

    public void setDescontoConcedido(float descontoConcedido) {
        this.descontoConcedido = descontoConcedido;
    }

    public ItemAtendimento getItemAtendimento() {
        return itemAtendimento;
    }

    public void setItemAtendimento(ItemAtendimento itemAtendimento) {
        this.itemAtendimento = itemAtendimento;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

}
