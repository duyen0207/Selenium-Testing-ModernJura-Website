import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeleniumTesting {
    public WebDriver driver;

    public SeleniumTesting() {
        System.setProperty("webdriver.chrome.driver", "src/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5000/");
    }

    @Test
    void Test_Register() {
        AuthTesting.register(driver, "duyenle2072001@gmail.com", "duyen0207", "duyen0207", "duyen0207");
        String expectedUrl = "http://127.0.0.1:5000/";
        String actualUrl = driver.getCurrentUrl();

        Assertions.assertEquals(expectedUrl, actualUrl);

        driver.quit();
    }

    @Test
    void Test_Login() {
        AuthTesting.login(driver, "duyenle2072001@gmail.com", "duyen0207");

        String expectedUrl = "http://127.0.0.1:5000/";
        String actualUrl = driver.getCurrentUrl();

        Assertions.assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }


}
