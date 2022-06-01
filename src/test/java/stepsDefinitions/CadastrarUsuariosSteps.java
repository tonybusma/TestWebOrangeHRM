package stepsDefinitions;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuariosSteps {
	
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
	    Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
	    Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employer name {string}")
	public void informarNoCampoEmployerName(String string) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployerName(string);
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String string) {
		Na(CadastrarUsuarioPage.class).informarCampoUserName(string);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String string) {
		Na(CadastrarUsuarioPage.class).informarCampoPassword(string);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String string) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(string);
	}
	
	@E("^acionar o botao salvar$")
	public void acionarOBotaoSalvar() throws Throwable {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String userName) throws Throwable {
		assertTrue(driver.findElement(By.xpath("//a[text()='" +userName+ "']")).isDisplayed());
	}

	

}
