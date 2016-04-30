package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import common.TestCaseCommon;

public class minhaConta {
	
	private WebElement buttonminhaConta;
	private WebElement buttonpreferencias;
	private WebElement buttonPerfil;
			
	public minhaConta() {
		
		buttonminhaConta = TestCaseCommon.getDriver().findElement(By.linkText("Minha Conta"));
		buttonpreferencias = TestCaseCommon.getDriver().findElement(By.xpath("//a[contains(@href, 'account_prefs_page.php')]"));
		buttonPerfil = TestCaseCommon.getDriver().findElement(By.linkText("Perfis"));
				
	}
	public WebElement getButtonpreferencias() {
		return buttonpreferencias;
	}
	public void setButtonpreferencias(WebElement buttonpreferencias) {
		this.buttonpreferencias = buttonpreferencias;
	}

	public WebElement getButtonminhaConta() {
		return buttonminhaConta;
	}
	public void setButtonminhaConta(WebElement buttonminhaConta) {
		this.buttonminhaConta = buttonminhaConta;
	}
	public WebElement getButtonPerfil() {
		return buttonPerfil;
	}
	public void setButtonPerfil(WebElement buttonPerfil) {
		this.buttonPerfil = buttonPerfil;
	}
	
		
}