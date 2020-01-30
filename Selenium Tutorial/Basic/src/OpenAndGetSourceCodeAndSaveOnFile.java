import java.io.FileWriter;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAndGetSourceCodeAndSaveOnFile {

	public static void main(String[] args) throws Exception{
		String path = "C:\\Users\\MONSTER\\GitProject\\Selenium-Testing\\Selenium Tutorial\\Basic\\src\\SourceCode.txt";
		FileWriter fos = new FileWriter(path);
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		fos.write(driver.getPageSource());
		fos.flush();
	}

}
