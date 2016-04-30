package testesmaven.maven;

//import static org.junit.Assert.assertEquals;

//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.not;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.fail;

//import java.util.ArrayList;

//import org.junit.After;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;

import page.atualizarPerfil;
import page.bug;
import page.busca;
import page.docs;
//import page.bug;
//import page.busca;
import page.home;
import page.login;
import page.minhaConta;
import common.TestCaseCommon;

//import org.openqa.selenium.By;

public class AppTest  {


	//private StringBuffer verificationErrors = new StringBuffer();


	@Before
	public void setUp() throws Exception {
			TestCaseCommon.getDriver().get(TestCaseCommon.URL_BASE + "/");
	}
	
	@Test
	public void login() {
	testeLogin login = new testeLogin();
	login.Testelogin();
		
	home paginahome = new home();
	paginahome.getButtonminhaConta().click();
	
	minhaConta paginaminhaConta = new minhaConta();
	paginaminhaConta.getButtonPerfil().click();
	
	atualizarPerfil paginaatualizarPerfil = new atualizarPerfil();
	assertEquals("input", paginaatualizarPerfil.getinputplatform());
	paginaatualizarPerfil.getInputplatform().sendKeys("teste");
	paginaatualizarPerfil.getInputos().sendKeys("teste");
	paginaatualizarPerfil.getInputdescription().sendKeys("teste");
	paginaatualizarPerfil.getInputosbuild().sendKeys("123");
	paginaatualizarPerfil.getButtoninput().click();
	
	home paginahome1 = new home();
	paginahome1.getButtonSair().click();
	
	login paginalogin = new login();
	assertEquals("input", paginalogin.getinputUserName());
		
	testeLogin login1 = new testeLogin();
	login1.Testelogin();
		
	busca paginabusca = new busca();
	paginabusca.getInpubugId().sendKeys("82323");
	paginabusca.getButtonbusca().click();
	
	bug paginabug = new bug();
	assertEquals("Imprimir", paginabug.getButtonImprimir().getText() );
	
	home paginahome11 = new home();
	paginahome11.getButtonSair().click();
	
	testeLogin login11 = new testeLogin();
	login11.Testelogin();
		
	home paginahome111 = new home();
	paginahome111.getButtonDocs().click();
	
	docs paginadocs = new docs();
	paginadocs.getButtonDownload().click();
	assertEquals("Checklist Baseline", paginadocs.getButtonDocUser().getText() );
	
	home paginahome2 = new home();
	paginahome2.getButtonSair().click();
	
	login paginalogin2 = new login();
	assertEquals("input", paginalogin2.getinputUserName());
	
	}		
	
}