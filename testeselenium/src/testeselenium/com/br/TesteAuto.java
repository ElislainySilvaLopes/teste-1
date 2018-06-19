package testeselenium.com.br;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue; 

public class TesteAuto {
	
	private WebDriver driver = null;

	
	@Before
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
				
		
	}
	
	
    @Test
	public void fluxo() {
    	
    	Logar Logar = new Logar(driver);
    	
    	Logar.LogarNoSistema();
    	
    	CadastrarUsuarios usuarios = new CadastrarUsuarios(driver);
    	usuarios.cadastrar();
    	
    	EditarUsuario usuarios1 = new EditarUsuario(driver);
    	usuarios1.editar();
		
    	DeletarUsuario usuarios2 = new DeletarUsuario(driver);
    	usuarios2.deletar();
    }
    


}
