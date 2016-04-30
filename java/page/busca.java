package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class busca {

	private WebElement inpubugId;
	private WebElement buttonbusca;
		
	public busca() {

		inpubugId = TestCaseCommon.getDriver().findElement(By.name("bug_id"));
		buttonbusca = TestCaseCommon.getDriver().findElement(By.cssSelector("input.button-small"));
			
	}


	public WebElement getInpubugId() {
		return inpubugId;
	}


	public void setInpubugId(WebElement inpubugId) {
		this.inpubugId = inpubugId;
	}


	public WebElement getButtonbusca() {
		return buttonbusca;
	}


	public void setButtonbusca(WebElement buttonbusca) {
		this.buttonbusca = buttonbusca;
	}

	
}