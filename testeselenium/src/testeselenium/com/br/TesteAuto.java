package testeselenium.com.br;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAuto {
	
	private WebDriver driver = null;

	
	@Before
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver.exe");
		this.driver = new ChromeDriver();
				
		
	}
	
	
    @Test
	public void fluxo() {
		driver.get("http://localhost/SisBiblio/");
		
		WebElement usuario = driver.findElement(By.id("usuario"));
		WebElement senha = driver.findElement(By.id("senha"));
		WebElement botaologar = driver.findElement(By.name("botao"));
		
		usuario.sendKeys("genissonfg@gmail.com");
		senha.sendKeys("123mudar");
		botaologar.submit();
		
    }
    


}
