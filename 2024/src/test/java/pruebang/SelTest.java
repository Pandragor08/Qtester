package pruebang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelTest {

static String url = "https://facebook.com";

  @Test
  public void testo1() {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();	
		driver.quit();
  }
}
