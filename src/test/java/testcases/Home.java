package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
		input.sendKeys("Wrist Watches");
		input.sendKeys(Keys.ENTER);
		
		WebElement display = driver.findElement(By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/1480900031\"]/span/a/div/label/i"));
		WebElement brandMaterial = driver.findElement(By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/div/label/i"));
		WebElement brand = driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i"));
		WebElement discount = driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span"));
		WebElement fifthElement = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[1]/div"));
		
		display.click();
		
		brandMaterial = driver.findElement(By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/div/label/i"));
		brandMaterial.click();
		
		brand = driver.findElement(By.xpath("//*[@id=\"p_89/Titan\"]/span/a/div/label/i"));
		brand.click();
		
		discount = driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span"));
		discount.click();
		
		fifthElement = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[1]/div"));
		fifthElement.click();
		
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
