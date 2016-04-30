package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class login {

	private WebElement inputUserName;
	private WebElement inputPassword;
	private WebElement buttonEntrar;
	private WebElement title;
	
	
	public login() {

		inputUserName = TestCaseCommon.getDriver().findElement(By.name("username"));
		inputPassword = TestCaseCommon.getDriver().findElement(By.name("password"));
		buttonEntrar = TestCaseCommon.getDriver().findElement(By.cssSelector("input.button"));
		title = TestCaseCommon.getDriver().findElement(By.cssSelector("td.form-title"));
	
	}


	public WebElement getButtonEntrar() {
		return buttonEntrar;
	}


	public void setButtonEntrar(WebElement buttonEntrar) {
		this.buttonEntrar = buttonEntrar;
	}


	public WebElement getInputUserName() {
		return inputUserName;
	}


	public void setInputUserName(WebElement inputUserName) {
		this.inputUserName = inputUserName;
	}


	public WebElement getInputPassword() {
		return inputPassword;
	}


	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}

	public void Login(String username, String password) {
		inputUserName.clear(); // WebElement
		inputUserName.sendKeys(username);
		inputPassword.clear();
		inputPassword.sendKeys(password);
		buttonEntrar.click();
	
	}

	public String getinputUserName() {
		System.out.println(inputUserName.getTagName());
		return inputUserName.getTagName();
	}
	
	public WebElement getTitle() {
		return title;
	}


	public void setTitle(WebElement title) {
		this.title = title;
	}


	public static boolean isElementPresent(By name) {
		// TODO Auto-generated method stub
		return false;
	}
}