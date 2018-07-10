package br.unesp.rc.s4lsa.service;

import br.unesp.rc.s4lsa.model.Fisica;
import br.unesp.rc.s4lsa.dao.ClienteFisicoDAO;
import br.unesp.rc.s4lsa.dao.FabricaDAO;

public class ClienteFisicoServiceImpl implements ClienteFisicoService {

    private ClienteFisicoDAO clienteFisicoDAO;

    public ClienteFisicoServiceImpl() {
        this.clienteFisicoDAO = FabricaDAO.getClienteFisicoDAO();
    }

    public boolean salvar(Fisica fisica) {
        boolean b = false;
        
        b = this.clienteFisicoDAO.salvar(fisica);
        
        return b;
    }

}
