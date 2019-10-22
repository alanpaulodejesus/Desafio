package Pages;

import Core.PropriedadesCampoPersonalizado;
import Core.PropriedadesProjeto;
import DSL.CampoTexto;
import DSL.Comando;
import DSL.Label;
import TestCampoPersonalizado.AdicionarCampoPersonalizadoEmProjetoTest;
import TestCampoPersonalizado.CriarCampoPersonalizadoTest;
import TestCampoPersonalizado.ExcluirCampoPersonalizadoTest;
import Utils.Tempo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Core.DriverFactory.getDriver;

public class CampoPersonalizadoPage {

    @FindBy(xpath = "//span[text()=\" Gerenciar \"]") private WebElement menuGerenciar;
    @FindBy(linkText = "Gerenciar Campos Personalizados") private WebElement menuCampoPersonalizados;
    @FindBy(name = "name") private WebElement campoNomePersonalizado;
    @FindBy(xpath = "//input[@value=\"Novo Campo Personalizado\"]") private WebElement comandoNovoCampoPersonalizado;
    @FindBy(linkText = PropriedadesCampoPersonalizado.nomeCampoPersonalizado) private WebElement campoPersonalizadoEmGrid;
    @FindBy(linkText = PropriedadesCampoPersonalizado.nomeCampoPersonalizadoAlterado) private WebElement campoPersonalizadoAlteradoEmGrid;
    @FindBy(xpath = "//input[@value=\"Atualizar Campo Personalizado\"]") private WebElement comandoNovoCampoPersonalizaoAlterar;
    @FindBy(xpath = "//input[@value=\"Apagar Campo Personalizado\"]") private WebElement comandoApagarCampoPersonalizado;
    @FindBy(xpath = "//input[@value=\"Apagar Campo\"]") private WebElement comandoConfirmaApagarCampoPersonalizado;
    @FindBy(xpath = "//option[text()=\""+ PropriedadesProjeto.nomeProjeto+"\"]") private WebElement projetoParaCampoPersonalizado;
    @FindBy(xpath = "//input[@value=\"Vincular Campo Personalizado\"]") private WebElement comandoVincularProjeto;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-white btn-round btn-xs']") private WebElement comandoRemover;
    @FindBy(xpath = "//input[@value=\"Remover Campo\"]") private WebElement comandoConfirmaRemover;

    public CampoPersonalizadoPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void acionarComandoMenuGerenciar()  {
        Comando.clicar(menuGerenciar);
    }

    public void acionarComandoApagarCampoPersonalizado(){
        Comando.clicar(comandoApagarCampoPersonalizado);
    }

    public void acionarComandoConfirmarApagarCampoPersonalizado(){
        Comando.clicar(comandoConfirmaApagarCampoPersonalizado);
    }

    public void preencherCampoNomePersonalizado(String texto)  {

        CampoTexto.preencher(campoNomePersonalizado, texto);
    }

    public void acionarMenuCampoPersonalizado(){
        Tempo.aguardar(5, menuCampoPersonalizados);
        Comando.clicar(menuCampoPersonalizados);
    }

    public void euAcionoComandoNovoCampoPersonalizado(){
        Comando.clicar(comandoNovoCampoPersonalizado);
    }

    public void acionarComandoAlterarCampoPersonalizado(){
        Comando.clicar(comandoNovoCampoPersonalizaoAlterar);
    }

    public void acionarCampoPersonalizadoEmGrid(){

        if(Label.textoPresente(campoPersonalizadoEmGrid)){
            Comando.clicar(campoPersonalizadoEmGrid);
        }else Comando.clicar(campoPersonalizadoAlteradoEmGrid);

    }

    public void acionarCampoPersonalizadoParaAdicionarEmGrid(){


        if(Label.textoPresente(campoPersonalizadoEmGrid)){
            Comando.clicar(campoPersonalizadoEmGrid);
        }else Comando.clicar(campoPersonalizadoAlteradoEmGrid);

    }

    public Boolean verificarCampoPersonalizadoEmGrid() {
        Tempo.aguardar(15, campoPersonalizadoEmGrid);
        try {
            Label.textoPresente(campoPersonalizadoEmGrid);
            campoPersonalizadoEmGrid.getSize();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean verificarCampoPersonalizadoAlteradoEmGrid() {
        Tempo.aguardar(5, campoPersonalizadoAlteradoEmGrid);
        try {

            Label.textoPresente(campoPersonalizadoAlteradoEmGrid);
            campoPersonalizadoAlteradoEmGrid.getSize();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean verificarCampoPersonalizadoExcluidoEmGrid() {
        try {

            if (Label.textoNaoPresente(campoPersonalizadoEmGrid)){
                campoPersonalizadoEmGrid.getSize();
            }else if(Label.textoNaoPresente(campoPersonalizadoAlteradoEmGrid)){
                campoPersonalizadoAlteradoEmGrid.getSize();
            }
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public void verificarSeExisteCampoPersonalidadoAExcluir(){

        Comando.clicar(menuGerenciar);
        Comando.clicar(menuCampoPersonalizados);
        ExcluirCampoPersonalizadoTest excluiCampoPersonalidado = new ExcluirCampoPersonalizadoTest();

        if(Label.textoPresente(campoPersonalizadoEmGrid)){
            excluiCampoPersonalidado.excluirCampoPersonalizado();
        }else {

        }
    }

    public void verificarSeExisteCampoPersonalidado(){

        Comando.clicar(menuGerenciar);
        Comando.clicar(menuCampoPersonalizados);
        CriarCampoPersonalizadoTest criaCampoPersonalizado = new CriarCampoPersonalizadoTest();


        if(Label.textoPresente(campoPersonalizadoEmGrid) || Label.textoPresente(campoPersonalizadoAlteradoEmGrid)){

        }else {
            criaCampoPersonalizado.criarCampoPersonalizado();

        }
    }

    public void acionarProjetoParaCampoPersonalizado(){
            Comando.clicar(projetoParaCampoPersonalizado);


    }

    public void acionarComandoVincularProjeto(){
        Comando.clicar(comandoVincularProjeto);
    }


    public Boolean verificarCampoVinculadoEmGrid() {
        try {
            Label.textoPresente(comandoRemover);
            comandoRemover.getSize();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void acionarComandoRemover(){
        Comando.clicar(comandoRemover);
    }

    public void acionarComandoConfirmaRemover(){
        Comando.clicar(comandoConfirmaRemover);
    }

    public void verificarSeExisteCampoPersonalizadoAdicionado() {

        AdicionarCampoPersonalizadoEmProjetoTest adicionar = new AdicionarCampoPersonalizadoEmProjetoTest();
        Comando.clicar(campoPersonalizadoEmGrid);

        if(Label.textoPresente(comandoRemover)){

        }else {
            adicionar.adicionaCampoPersonalizadoEmProjeto();
        }
    }

}
