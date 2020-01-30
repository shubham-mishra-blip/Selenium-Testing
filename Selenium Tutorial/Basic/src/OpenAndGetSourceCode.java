import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAndGetSourceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getPageSource());
	}

}
	