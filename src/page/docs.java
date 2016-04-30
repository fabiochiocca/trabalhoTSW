package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class docs {

	private WebElement buttonDocs;
	private WebElement buttonDownload;
	private WebElement buttonDocUser;
		
	public docs() {

		buttonDocs = TestCaseCommon.getDriver().findElement(By.linkText("Docs"));
		buttonDownload = TestCaseCommon.getDriver().findElement(By.linkText("Checklist T�cnico"));
		buttonDocUser = TestCaseCommon.getDriver().findElement(By.linkText("Documenta��o do Usu�rio"));
			
	}

	public WebElement getButtonDocs() {
		return buttonDocs;
	}

	public void setButtonDocs(WebElement buttonDocs) {
		this.buttonDocs = buttonDocs;
	}

	public WebElement getButtonDownload() {
		return buttonDownload;
	}

	public void setButtonDownload(WebElement buttonDownload) {
		this.buttonDownload = buttonDownload;
	}

	public WebElement getButtonDocUser() {
		return buttonDocUser;
	}

	public void setButtonDocUser(WebElement buttonDocUser) {
		this.buttonDocUser = buttonDocUser;
	}


}