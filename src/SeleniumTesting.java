import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5000/");

    }
}
