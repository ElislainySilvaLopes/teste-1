package testeselenium.com.br;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Logar {
	
	
	private WebDriver driver = null;

	public Logar (WebDriver driver) {
		this.driver = driver;
	
	
}
	
	public void LogarNoSistema () {
		
		driver.get("http://localhost/SisBiblio/");
		
		WebElement usuario = driver.findElement(By.id("usuario"));
		WebElement senha = driver.findElement(By.id("senha"));
		WebElement botaologar = driver.findElement(By.name("botao"));
		
		usuario.sendKeys("genissonfg@gmail.com");
		senha.sendKeys("123mudar");
		botaologar.submit();
	}

}
