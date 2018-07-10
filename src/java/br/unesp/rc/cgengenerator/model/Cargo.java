package br.unesp.rc.s4lsa.model;

public enum Cargo {

    MECANICO(1), VENDEDOR(2), GERENTE(3);

    private int cargo;

    private Cargo(int cargo) {
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

}
