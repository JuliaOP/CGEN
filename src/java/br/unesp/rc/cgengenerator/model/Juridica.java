package br.unesp.rc.s4lsa.model;

public class Juridica extends Pessoa {

    private String cnpj;

    public Juridica() {

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
