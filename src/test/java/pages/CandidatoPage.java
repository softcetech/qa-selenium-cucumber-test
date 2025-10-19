package pages;

import elements.CandidatoElementMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class CandidatoPage extends CandidatoElementMap {

        WebDriver driver = DriverFactory.getDriver();

    public void entrarNaPaginaDeCadastro() {
        driver.get("https://formy-project.herokuapp.com/form");
    }


    public void preencherDadosCadastrais() {
        driver.findElement(nome).sendKeys("Teste");
        driver.findElement(sobrenome).sendKeys("Homem Aranha");
        driver.findElement(profissao).sendKeys("Homem Aranha");
        driver.findElement(escolaridade).click();
        driver.findElement(genero).click();
        driver.findElement(experiencia).click();
        driver.findElement(dataDeNascimento).sendKeys("15/03/1998");

    }

    public void clicarSubmit() {
       driver.findElement(submit).click();
    }

    public void mensagemDeSucesso() {
        driver.getCurrentUrl().contains("thanks");
        driver.getPageSource().contains("The form was successfully submitted!");

    }
}
