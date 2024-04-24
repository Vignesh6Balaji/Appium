package browser_tests;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
public class ChromeTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("deviceName", "Vivo Y91i");
		caps.setCapability("platformName", "Android");
		caps.setCapability("udid", "LFTWPVGMMZHQV8KB");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "com.android.bbkcalculator");
		caps.setCapability("appActivity", "com.android.bbkcalculator.Calculator");
		caps.setCapability("noReset", true);
		
		AppiumDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		driver.findElement(By.id("com.android.bbkcalculator:id/digit9")).click();
		driver.findElement(By.id("com.android.bbkcalculator:id/plus")).click();
		driver.findElement(By.id("com.android.bbkcalculator:id/digit1")).click();
		driver.findElement(By.id("com.android.bbkcalculator:id/equal")).click();
		
		driver.quit();
	}

}
