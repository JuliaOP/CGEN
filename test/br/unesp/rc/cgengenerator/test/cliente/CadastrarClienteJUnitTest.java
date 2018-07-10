/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.s4lsa.test.cliente;

import br.unesp.rc.s4lsa.model.Contato;
import br.unesp.rc.s4lsa.model.Endereco;
import br.unesp.rc.s4lsa.model.Fisica;
import br.unesp.rc.s4lsa.service.ClienteFisicoService;
import br.unesp.rc.s4lsa.service.FabricaService;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author aluno
 */
public class CadastrarClienteJUnitTest {

    private Fisica f;

    public CadastrarClienteJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        f = new Fisica();
        f.setNome("Harry Deitel");
        f.setCpf("123.456.789-12");
        f.setDataNascimento(new Date());

        Contato c = new Contato();
        c.setTelefoneResidencial("3333-4444");
        c.setTelefoneComercial("4444-5555");
        c.setCelular("99999-8888");
        c.setEmail("harry@deitel.com");

        f.setContato(c);

        Endereco e1 = new Endereco();
        e1.setRua("Avenida 24A");
        e1.setNumero(1515);
        e1.setBairro("Bela Vista");
        e1.setCidade("Rio Claro");
        e1.setEstado("SP");
        e1.setCep("13500-090");
        e1.setPais("Brasil");

        f.setEndereco(e1);

        Endereco e2 = new Endereco();
        e2.setRua("Avenida 24A");
        e2.setNumero(2020);
        e2.setBairro("Bela Vista");
        e2.setCidade("Rio Claro");
        e2.setEstado("SP");
        e2.setCep("13500-090");
        e2.setPais("Brasil");

        f.setEndereco(e2);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:    
    @Test
    public void cadastrarCliente() {
        boolean resultadoEsperado = true;
        
        ClienteFisicoService cfs = FabricaService.getClienteFisicoService();
        boolean resultadoObtido = cfs.salvar(f);
        
        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }
}
