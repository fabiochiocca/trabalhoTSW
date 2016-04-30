package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class home {

	private WebElement buttonminhaConta;
	private WebElement buttonDocs;
	private WebElement buttonSair;
	
	
	public home() {
		
		buttonSair = TestCaseCommon.getDriver().findElement(By.linkText("Sair"));
		buttonDocs = TestCaseCommon.getDriver().findElement(By.linkText("Docs"));
		buttonminhaConta = TestCaseCommon.getDriver().findElement(By.linkText("Minha Conta"));
	}

	public WebElement getButtonSair() {
		return buttonSair;
	}

	public void setButtonSair(WebElement buttonSair) {
		this.buttonSair = buttonSair;
	}

	public WebElement getButtonDocs() {
		return buttonDocs;
	}

	public void setButtonDocs(WebElement buttonDocs) {
		this.buttonDocs = buttonDocs;
	}

	public WebElement getButtonminhaConta() {
		return buttonminhaConta;
	}

	public void setButtonminhaConta(WebElement buttonminhaConta) {
		this.buttonminhaConta = buttonminhaConta;
	}


}