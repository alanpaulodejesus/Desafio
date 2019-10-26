package SuiteTest;

import TestCampoPersonalizado.AdicionarCampoPersonalizadoEmProjetoTest;
import TestCampoPersonalizado.AlterarCampoPersonalizadoTest;
import TestCampoPersonalizado.CriarCampoPersonalizadoTest;
import TestCampoPersonalizado.RemoverCampoPersonalizadoEmProjetoTest;
import TestCategoria.AlterarCategoriaTest;
import TestCategoria.ApagarCategoriaTest;
import TestCategoria.CadastrarCategoriaTest;
import TestLogin.LoginInvalidoTest;
import TestLogin.LoginValidoTest;
import TestMarcador.AlterarMarcadorTest;
import TestMarcador.CriarMarcadorTest;
import TestMarcador.ExcluirMarcadorTest;
import TestPerfil.AlterarPerfilTest;
import TestPerfil.CriarPerfilTest;
import TestProjeto.*;
import TestTarefas.*;
import TestToken.GerarTokenTest;
import TestToken.RevogarTokenTest;
import TestUsuario.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({


        LoginInvalidoTest.class,
        LoginValidoTest.class,
        AdicionarUsuarioEmProjetoTest.class,
        AlterarUsuarioTest.class,
        ApagarUsuarioTest.class,
        CriarUsuarioTest.class,
        MostrarUsuarioDesabilitadoTest.class,
        MostrarUsuarioHabilitadoTest.class,
        PesquisarUsuarioTest.class,
        RedefinirSenhaUsuarioTest.class,
        RemoverUsuarioEmProjetoTest.class,
        RepresentarUsuarioTest.class,
        GerarTokenTest.class,
        RevogarTokenTest.class,
        AdicionarFiltroTarefasTest.class,
        AdicionarMarcadorEmTarefasTest.class,
        AlterarCategoriaEmTarefasTest.class,
        AlterarStatusTarefasTest.class,
        ApagarMarcadorEmTarefasTest.class,
        ApagarTarefasTest.class,
        ClonarTarefasTest.class,
        CriarTarefasTest.class,
        DesmarcarTarefaPegajosaTest.class,
        FecharTarefasTest.class,
        ImprimirTarefasTest.class,
        MarcarTarefaPegajosaTest.class,
        MonitorarTarefasTest.class,
        MoverTarefasTest.class,
        //=====
        PararDeMonitorarTarefasTest.class,
        PesquisarTarefasTest.class,
        RedefinirFiltroTarefasTest.class,
        //=====
        AlterarProjetoTest.class,
        AlterarVisibilidadeDeProjetoPrivadoTest.class,
        AlterarVisibilidadeDeProjetoPublicoTest.class,
        CriarProjetoTest.class,
        ExcluirProjetoTest.class,
        AlterarPerfilTest.class,
        CriarPerfilTest.class,
        ExcluirProjetoTest.class,
        AlterarMarcadorTest.class,
        CriarMarcadorTest.class,
        ExcluirMarcadorTest.class,
        AlterarCategoriaTest.class,
        ApagarCategoriaTest.class,
        CadastrarCategoriaTest.class,
        AdicionarCampoPersonalizadoEmProjetoTest.class,
        AlterarCampoPersonalizadoTest.class,
        CriarCampoPersonalizadoTest.class,
        ExcluirMarcadorTest.class,
        RemoverCampoPersonalizadoEmProjetoTest.class


})
public class SuiteTest {

}
