package testeselenium.com.br;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastrarUsuarios {
	
	private WebDriver driver = null;

	public CadastrarUsuarios (WebDriver driver) {
		this.driver = driver;
	
	
}
	
	public void cadastrar() {
		
		driver.findElement(By.linkText("Novo Contato")).click();
		
		
		WebElement camponome = driver.findElement(By.id("nome"));
		WebElement campoidade = driver.findElement(By.id("idade"));
		WebElement campoend = driver.findElement(By.id("endereco"));
		WebElement botaoSalvar = driver.findElement(By.name("salvar"));
		
		camponome.sendKeys("Luiz José Gonçalves");
		campoidade.sendKeys("65");
		campoend.sendKeys("Rua Monteiro Lobato, 75 - Cidade Nobre");
		botaoSalvar.submit();
		
		
	}
	
	
	

}
