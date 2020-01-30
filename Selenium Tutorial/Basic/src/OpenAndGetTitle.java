import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAndGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://fb.com");
		System.out.println(driver.getTitle());
	}

}
