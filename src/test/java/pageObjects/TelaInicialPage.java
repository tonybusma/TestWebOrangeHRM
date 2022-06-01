package pageObjects;
import static utils.Utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {

	public void acionarAbaAdmin() {
		abaAdmin.click();
	}

	// elementos
	@FindBy(name = "btnAdd")
	public WebElement botaoAdd;

	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	
	public void acessarMenuCustomField() {
		Actions acao = new Actions(driver);
		acao.moveToElement(abaPim).build().perform();
		acao.moveToElement(menuConfiguration).build().perform();
		acao.moveToElement(menuField).click().build().perform();
	}

}
