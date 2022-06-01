package stepsDefinitions;
import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class TestandoActionsSteps {
	
	@Quando("eu acionar o submenu customField")
	public void euAcionarOSubmenuCustomField() {
	    Na(TelaInicialPage.class).acessarMenuCustomField();
	}

	@Entao("o sistema apresenta a tela customField")
	public void oSistemaApresentaATelaCustomField() {
	    assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());
	}

}
