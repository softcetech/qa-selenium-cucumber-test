package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class CandidatoElementMap {

    protected By nome =  By.id("first-name");
    protected By sobrenome = By.id("last-name");
    protected By profissao = By.id("job-title");
    protected By escolaridade = By.cssSelector("#radio-button-3");
    protected By genero = By.cssSelector("#checkbox-2");
    protected By experiencia = By.cssSelector("#select-menu > option:nth-child(5)");
    protected By dataDeNascimento =  By.cssSelector("#datepicker");
    protected By submit = By.cssSelector("body > div > form > div > div:nth-child(15) > a");

}
