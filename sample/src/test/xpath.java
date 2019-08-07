package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sravan\\Desktop\\GitRepository\\sample\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//*[@id=\'menu_leave_viewLeaveModule\']/b")).click();
		WebElement dropdownmonth=driver.findElement(By.xpath("//*[@id='leaveperiod_cmbStartMonth']"));
		List<WebElement> option=dropdownmonth.findElements(By.tagName("option"));
		
		for(WebElement e:option) {
			System.out.println(e.getAttribute("value"));
			if(e.getAttribute("value").equals("5"))
			e.click();
		}
		
		WebElement dropdowndate=driver.findElement(By.xpath("//*[@id=\'leaveperiod_cmbStartDate\']"));
		List<WebElement> option1=dropdowndate.findElements(By.tagName("option"));
		
		for(WebElement e:option1) {
			System.out.println(e.getAttribute("value"));
			if(e.getAttribute("value").equals("17"))
				e.click();
		}
		
		
		}
	}


