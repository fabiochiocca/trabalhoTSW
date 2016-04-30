package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import common.TestCaseCommon;

public class atualizarPerfil {
	
	private WebElement buttonminhaConta;
	private WebElement buttonpreferencias;
	private WebElement buttoninput;
	private WebElement inputplatform;
	private WebElement inputos;
	private WebElement inputdescription;
	private WebElement inputosbuild;
	
	public atualizarPerfil() {
		
		buttonminhaConta = TestCaseCommon.getDriver().findElement(By.linkText("Minha Conta"));
		buttonpreferencias = TestCaseCommon.getDriver().findElement(By.xpath("//a[contains(@href, 'account_prefs_page.php')]"));
		buttoninput = TestCaseCommon.getDriver().findElement(By.cssSelector("input.button"));
		inputplatform = TestCaseCommon.getDriver().findElement(By.name("platform"));
		inputos = TestCaseCommon.getDriver().findElement(By.name("os"));
		inputdescription =TestCaseCommon.getDriver().findElement(By.name("description"));
		inputosbuild =TestCaseCommon.getDriver().findElement(By.name("os_build"));
			  		
	}

	public WebElement getButtonminhaConta() {
		return buttonminhaConta;
	}

	public void setButtonminhaConta(WebElement buttonminhaConta) {
		this.buttonminhaConta = buttonminhaConta;
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

	public WebElement getInputplatform() {
		return inputplatform;
	}

	public void setInputplatform(WebElement inputplatform) {
		this.inputplatform = inputplatform;
	}

	public WebElement getInputos() {
		return inputos;
	}

	public void setInputos(WebElement inputos) {
		this.inputos = inputos;
	}

	public WebElement getInputdescription() {
		return inputdescription;
	}

	public void setInputdescription(WebElement inputdescription) {
		this.inputdescription = inputdescription;
	}

	public WebElement getInputosbuild() {
		return inputosbuild;
	}

	public void setInputosbuild(WebElement inputosbuild) {
		this.inputosbuild = inputosbuild;
	}
		
	public String getinputplatform() {
		System.out.println(inputplatform.getTagName());
		return inputplatform.getTagName();
		
		
	}
	
	
	
	
	
		
}