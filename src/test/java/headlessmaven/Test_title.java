package headlessmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Test_title {
	@Test
	public void test() {
	
	ChromeOptions option = new ChromeOptions();
	
	option.addArguments("--headless=new");
	
WebDriverManager.chromedriver().setup();



WebDriver driver = new ChromeDriver(option);

driver.get("https://www.amazon.in/");


System.out.print("Title is :" + driver.getTitle());

driver.close();
	}

}
