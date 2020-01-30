import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenLink {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.get("https://facebook.com");
		
	}

}
