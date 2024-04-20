package prueba;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {
	//Se declara url
	static String url = "https://facebook.com";

	public static void main(String[] args) {
	
	// Inicia variable driver para manejar el webdriver
	WebDriver driver = new ChromeDriver();
	//se obtiene pagina web
	driver.get(url);
	//se abre pantalla completa
	driver.manage().window().fullscreen();	
	//se termina de ejecutar script 
	driver.quit();
	
	}

}
