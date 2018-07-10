/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.s4lsa.test.funcionario;

import br.unesp.rc.s4lsa.model.Acesso;
import br.unesp.rc.s4lsa.model.Funcionario;
import br.unesp.rc.s4lsa.service.FabricaService;
import br.unesp.rc.s4lsa.service.FuncionarioService;
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
public class EfeturarLoingJUnitTest {

    private Funcionario f;

    public EfeturarLoingJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        f = new Funcionario();
        Acesso a = new Acesso();
        a.setUsuario("glaubear");
        a.setSenha("1234");
        f.setAcesso(a);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void efetuarLogin() {
        boolean resultadoEsperado = true;
        
        FuncionarioService fs = FabricaService.getFuncionarioService();
        boolean resultadoObtido = fs.efetuarLogin(f);

        Assert.assertEquals(resultadoEsperado, resultadoObtido);
    }
}
