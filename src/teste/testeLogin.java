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

import page.home;
import page.login;
//import page.logout;

import common.TestCaseCommon;
//import org.openqa.selenium.By;

public class testeLogin {
	

	@Before
	public void setUp() throws Exception {
			TestCaseCommon.getDriver().get(TestCaseCommon.URL_BASE + "/");
	}
	
	@Test
	public void Testelogin() {
	login paginalogin = new login();
	paginalogin.getInputUserName().sendKeys("fabio.chiocca");
	paginalogin.getInputPassword().sendKeys("linx123");
	paginalogin.getButtonEntrar().click();
	
	home paginahome = new home();
	assertEquals("Minha Conta", paginahome.getButtonminhaConta().getText() );
	
	
	}
	
}