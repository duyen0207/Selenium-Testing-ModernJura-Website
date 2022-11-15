import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testPlayGame {
    public static String testPlayGame(WebDriver driver) throws InterruptedException {
        driver.get("http://127.0.0.1:5000/gamePage/3");
        WebElement play = driver.findElement(By.xpath("//a[text()=' Play']"));

        return play.getAttribute("href");
    }
}
