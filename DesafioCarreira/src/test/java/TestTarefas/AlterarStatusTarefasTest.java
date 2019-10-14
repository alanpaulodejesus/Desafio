package TestTarefas;

import Core.Propriedades;
import Core.PropriedadesTarefas;
import Pages.LoginPage;
import Pages.TarefasPage;
import TestLogin.LoginValidoTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static Core.DriverFactory.getDriver;

public class AlterarStatusTarefasTest {

    LoginValidoTest login = new LoginValidoTest();
    LoginPage logout = new LoginPage();
    TarefasPage alterarStatusTarefas = new TarefasPage();


    @Before
    public void setUp(){

        getDriver().get(Propriedades.URL);
        login.realizarLoginValido();
        alterarStatusTarefas.verificoSeExisteTarefa();

    }

    @Test
    public void alterarStatusAtividade(){

        alterarStatusTarefas.euAcessoMenuVerTarefas();
        alterarStatusTarefas.euAcionoIconeEditar();
        alterarStatusTarefas.euSelecionoGravidadeObstaculoBug(PropriedadesTarefas.gravidadeBugObstaculo);
        alterarStatusTarefas.euAcionoComandoAtualizacaoInformacaoEmTarefa();

    }

    @After
    public void tearDown(){

        Assert.assertTrue(alterarStatusTarefas.euVerificoAlteracaoStatusEmAtividade());
        alterarStatusTarefas.excluirTodasTarefas();
        logout.euRealizoLogout();
    }
}