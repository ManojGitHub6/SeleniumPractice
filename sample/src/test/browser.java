package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravan\\Desktop\\GitRepository\\sample\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String Expected="Amazon";
		String actual=driver.getTitle();
		if(actual.equals(Expected)) {
			System.out.println("Test Pass");
		}
		else
			System.out.println("Test Fail");
		driver.navigate().back();
		driver.close();
		System.out.println("Hello");
		
	}

}
