import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Testmid {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.xpath("//*//*[@id=\"vfb-5\"]")).sendKeys("Kittipong");
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Dachjit");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("88/7");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("-");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("thamaka");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("thamaka");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("kanchanaburi");
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("Kittipong@hotmail.com");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("08/15/45");
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0988650599");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("98");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		
		
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
		
		assertEquals("Dynamic Transaction Verification",result);
		
		Thread.sleep(4000);
		 driver.quit();
	
	}

}
