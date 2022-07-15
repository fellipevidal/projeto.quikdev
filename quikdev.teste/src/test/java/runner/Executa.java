package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features/",
		glue = "steps",
		tags = "@ct01",
		plugin = {"pretty", "html:target/quikdev.cucumber"},
		dryRun = false,
		monochrome = true,
		snippets = SnippetType.CAMELCASE	
		
		)

public class Executa extends Drivers{

	public void iniciarTeste(String site) {
		
		String navegador = "chrome";
		
		if(navegador.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		
		}else if(navegador.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		
		}else if(navegador.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
	
		driver.manage().window().maximize();
		driver.get(site);
	}
	
	
	@AfterClass
	public static void finalizarTeste() {
		
		driver.quit();
	}
	
}
