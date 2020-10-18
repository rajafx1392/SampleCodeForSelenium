import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleProgram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
			"F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("rajafx1392@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("raja1392");
	driver.findElement(By.id("loginbutton")).click();
	

}
}