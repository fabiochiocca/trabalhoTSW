package page;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class paginaMenu  {

	private WebElement buttonEntrar;
	private WebElement buttonSair;
	private WebElement buttonDocs;
	private WebElement buttonminhaConta;
	private WebElement buttoninput;
	private WebElement buttonlingua;
	private WebElement buttonpreferencias;
	private WebElement inputDelay;
	private WebElement buttonPerfil;
	private WebElement inputbugId;
	private WebElement buttonbusca;
	private WebElement buttonImprimir;
	private ArrayList<String> listobject;
	
	public paginaMenu()  {
		System.out.println("ConteudoPesquisa");
		buttonEntrar = TestCaseCommon.getDriver().findElement(By.cssSelector("input.button"));
		buttonSair = TestCaseCommon.getDriver().findElement(By.linkText("Sair"));
	    buttonDocs = TestCaseCommon.getDriver().findElement(By.linkText("Docs"));
	    buttonminhaConta = TestCaseCommon.getDriver().findElement(By.linkText("Minha Conta"));
	    buttoninput = TestCaseCommon.getDriver().findElement(By.cssSelector("input.button"));
	    buttonlingua = TestCaseCommon.getDriver().findElement(By.name("language"));
	    buttonpreferencias = TestCaseCommon.getDriver().findElement(By.xpath("//a[contains(@href, 'account_prefs_page.php')]"));
	    inputDelay = TestCaseCommon.getDriver().findElement(By.name("refresh_delay"));
	    buttonPerfil = TestCaseCommon.getDriver().findElement(By.linkText("Perfis"));
	    inputbugId = TestCaseCommon.getDriver().findElement(By.name("bug_id"));
	    buttonbusca = TestCaseCommon.getDriver().findElement(By.cssSelector("input.button-small"));
	    buttonImprimir = TestCaseCommon.getDriver().findElement(By.name("Imprimir"));
	}

	public void setObjetos() {
	        listobject = new ArrayList<String>();
	        listobject.add(buttonEntrar.getText());
	        listobject.add(buttonDocs.getText());
	        listobject.add(buttonSair.getText());
	        listobject.add(buttonminhaConta.getText());
	        listobject.add(buttoninput.getText());
	        listobject.add(buttonlingua.getText());
	        listobject.add(buttonpreferencias.getText());
	        listobject.add(inputDelay.getText());
	        listobject.add(buttonPerfil.getText());
	        listobject.add(buttonbusca.getText());
	}                

	public WebElement getButtonEntrar() {
		return buttonEntrar;
	}

	public void setButtonEntrar(WebElement buttonEntrar) {
		this.buttonEntrar = buttonEntrar;
	}

	public ArrayList<String> getListobject() {
		return listobject;
	}

	public void setListobject(ArrayList<String> listobject) {
		this.listobject = listobject;
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

	public WebElement getButtonpreferencias() {
		return buttonpreferencias;
	}

	public void setButtonpreferencias(WebElement buttonpreferencias) {
		this.buttonpreferencias = buttonpreferencias;
	}

	public WebElement getInputDelay() {
		return inputDelay;
	}

	public void setInputDelay(WebElement inputDelay) {
		this.inputDelay = inputDelay;
	}

	public WebElement getButtonPerfil() {
		return buttonPerfil;
	}

	public void setButtonPerfil(WebElement buttonPerfil) {
		this.buttonPerfil = buttonPerfil;
	}

	public WebElement getInputbugId() {
		return inputbugId;
	}

	public void setInputbugId(WebElement inputbugId) {
		this.inputbugId = inputbugId;
	}

	public WebElement getButtonbusca() {
		return buttonbusca;
	}

	public void setButtonbusca(WebElement buttonbusca) {
		this.buttonbusca = buttonbusca;
	}

	public WebElement getButtonImprimir() {
		return buttonImprimir;
	}

	public void setButtonImprimir(WebElement buttonImprimir) {
		this.buttonImprimir = buttonImprimir;
	}
	
}