package nova.conta;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	
	WebDriver driver;

	public void abrirNavegador(String url, String navegador) {

		if(navegador == "CHROME") {
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		} else if (navegador == "FIREFOX") {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		} else {
			
			System.out.println("Opção inválida, escolha CHROME ou FIREFOX");
			
		}
		
	}
	
	public void escrever(By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
		
	}
	
	public void submit(By elemento) {
		
		driver.findElement(elemento).submit();
		
	}
	
	public void pausa() throws InterruptedException {
		
		Thread.sleep(8000);
		
	}
	
	public void fecharNavegador() {
		
		driver.quit();
		
	}

	public void validacao(By elemento, String texto) {
		
		String txt = driver.findElement(elemento).getText();
		assertEquals(texto, txt);
	}

}
