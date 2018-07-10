package br.unesp.rc.s4lsa.service;

public class FabricaService {

    private FabricaService() {

    }

    public static ClienteFisicoService getClienteFisicoService() {
        return new ClienteFisicoServiceImpl();
    }
    
    public static FuncionarioService getFuncionarioService() {
        return new FuncionarioSeviceImpl();
    }

}
