package teste;

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
import page.home;
import page.minhaConta;
import common.TestCaseCommon;

//import org.openqa.selenium.By;

public class testeatualizarPerfil {


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
		
	
	}		
}