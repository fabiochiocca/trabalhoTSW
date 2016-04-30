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
import static org.junit.Assert.assertEquals;

//import org.eclipse.jdt.internal.compiler.ast.AssertStatement;
import org.junit.Before;
import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;






import page.bug;
import page.busca;
//import page.logout;
import common.TestCaseCommon;
//import org.openqa.selenium.By;

public class testebusca {


	//private StringBuffer verificationErrors = new StringBuffer();


	@Before
	public void setUp() throws Exception {
			TestCaseCommon.getDriver().get(TestCaseCommon.URL_BASE + "/");
	}
	
	@Test
	public void login() {
		
	testeLogin login = new testeLogin();
	login.Testelogin();
		
	busca paginabusca = new busca();
	paginabusca.getInpubugId().sendKeys("82323");
	paginabusca.getButtonbusca().click();
	
	bug paginabug = new bug();
	assertEquals("Imprimir", paginabug.getButtonImprimir().getText() );
		
	}		
}