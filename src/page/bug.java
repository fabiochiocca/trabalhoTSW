package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class bug {
	
	private WebElement buttonImprimir;
	
	public bug() {

		
		buttonImprimir = TestCaseCommon.getDriver().findElement(By.linkText("Imprimir"));
	
	}

	public WebElement getButtonImprimir() {
		return buttonImprimir;
	}


	public void setButtonImprimir(WebElement buttonImprimir) {
		this.buttonImprimir = buttonImprimir;
	}

	
	
	
}