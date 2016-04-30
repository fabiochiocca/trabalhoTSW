package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class logout {
	
	private WebElement buttonSair;
	
	public void sair() {
				
		buttonSair = TestCaseCommon.getDriver().findElement(By.linkText("Sair"));
		
	}

	public WebElement getButtonSair() {
		return buttonSair;
	}

	public void setButtonSair(WebElement buttonSair) {
		this.buttonSair = buttonSair;
	}
	
	

}
