package br.unesp.rc.s4lsa.model;

import java.util.Date;

public class Fisica extends Pessoa {

    private String cpf;

    private Date dataNascimento;

    public Fisica() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }    

}
