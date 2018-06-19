package testeselenium.com.br;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditarUsuario {
	
		
		private WebDriver driver = null;

		public EditarUsuario (WebDriver driver) {
			this.driver = driver;
		
		
	}
		
		public void editar() {
			
			driver.findElement(By.linkText("Editar")).click();
			
			WebElement limpar = driver.findElement(By.name("limpar"));
			WebElement camponome = driver.findElement(By.id("nome"));
	    	WebElement campoidade = driver.findElement(By.id("idade"));
	    	WebElement campoend = driver.findElement(By.id("endereco"));
	    	WebElement botaoSalvar = driver.findElement(By.name("salvar"));
		
		
	        limpar.click();
    		camponome.sendKeys("José Antônio Rosa");
    		campoidade.sendKeys("55");
    		campoend.sendKeys("Rua Joaquim Nabuco, 1000 - Caravelas");
    		botaoSalvar.click();
         
         
			
		}
		

}
