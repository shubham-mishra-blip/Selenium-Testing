import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "jre path");
		//System.setProperty("webdriver.chrome.driver", "jre path");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

}
