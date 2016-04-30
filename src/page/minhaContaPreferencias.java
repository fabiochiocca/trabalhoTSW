package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import common.TestCaseCommon;

public class minhaContaPreferencias {
	
	private WebElement buttonminhaConta;
	private WebElement buttonpreferencias;
	private WebElement buttoninput;
	private WebElement buttonlingua;
	private WebElement inputDelay;
		
	public minhaContaPreferencias() {
		
		buttonminhaConta = TestCaseCommon.getDriver().findElement(By.linkText("Minha Conta"));
		buttonpreferencias = TestCaseCommon.getDriver().findElement(By.xpath("//a[contains(@href, 'account_prefs_page.php')]"));
		buttoninput = TestCaseCommon.getDriver().findElement(By.cssSelector("input.button"));
		buttonlingua = TestCaseCommon.getDriver().findElement(By.name("language"));
		inputDelay = TestCaseCommon.getDriver().findElement(By.name("refresh_delay"));
		
	}
	public WebElement getButtonpreferencias() {
		return buttonpreferencias;
	}
	public void setButtonpreferencias(WebElement buttonpreferencias) {
		this.buttonpreferencias = buttonpreferencias;
	}
	public WebElement getButtoninput() {
		return buttoninput;
	}
	public void setButtoninput(WebElement buttoninput) {
		this.buttoninput = buttoninput;
	}
	public WebElement getButtonlingua() {
		return buttonlingua;
	}
	public void setButtonlingua(WebElement buttonlingua) {
		this.buttonlingua = buttonlingua;
	}
	public WebElement getButtonminhaConta() {
		return buttonminhaConta;
	}
	public void setButtonminhaConta(WebElement buttonminhaConta) {
		this.buttonminhaConta = buttonminhaConta;
	}
	public WebElement getInputDelay() {
		return inputDelay;
	}
	public void setInputDelay(WebElement inputDelay) {
		this.inputDelay = inputDelay;
	}
	
		
}