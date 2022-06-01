package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployer;

	@FindBy(name = "systemUser[userName]")
	public WebElement campoUserName;

	@FindBy(name = "systemUser[password]")
	public WebElement campoPassword;

	@FindBy(name = "systemUser[confirmPassword]")
	public WebElement campoConfirmarPassword;

	@FindBy(name = "btnSave")
	public WebElement botaoSalvar;

	public void informarCampoEmployerName(String employerName) {
		campoEmployer.sendKeys(employerName);
	}

	public void informarCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}

	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}

	public void informarCampoConfirmarPassword(String password) {
		campoConfirmarPassword.sendKeys(password);
	}

	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}

}
