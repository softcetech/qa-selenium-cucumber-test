package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CandidatoPage;

public class CandidatoSteps {

    CandidatoPage candidatoPage = new CandidatoPage();

    @Given("o usuario entra na pagina do formulario de cadastro de candidato")
    public void oUsuarioEntraNaPaginaDoFormularioDeCadastroDeCandidato() {
        candidatoPage.entrarNaPaginaDeCadastro();
    }

    @When("o usuario preenche as informacoes obrigatorias de cadastro")
    public void oUsuarioPreencherAsInformacoesObrigatoriasDeCadastro() {
        candidatoPage.preencherDadosCadastrais();
    }

    @And("registra as informacoes clicando no botao SUBMIT")
    public void registrarAsInformacoesClicandoNoBotaoSUBMIT() {
        candidatoPage.clicarSubmit();
    }

    @Then("o usuario deve validar mensagem de sucesso")
    public void oUsuarioDeveValidarMensagemDeSucesso() {
        candidatoPage.mensagemDeSucesso();
    }
}
