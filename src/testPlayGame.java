import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPlayGame {
    public static void testPlayGame(WebDriver driver) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/ChromeDriver/chromedriver.exe");

        driver.get("http://127.0.0.1:5000/gamePage/3");

        driver.findElement(By.xpath("//a[text()=' Play']")).click();
    }
}
