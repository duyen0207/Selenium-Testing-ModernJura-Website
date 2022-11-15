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
    void Test1_Register() throws InterruptedException {
//        Thread.sleep(1000);
        driver.manage().window().maximize();

        AuthTesting.register(driver, "duyenle2072001@gmail.com", "duyen0207", "duyen0207", "duyen0207");
//        Thread.sleep(1000);
        String expectedUrl = "http://127.0.0.1:5000/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);

        driver.quit();
    }

    @Test
    void Test2_Login() throws InterruptedException {
//        Thread.sleep(1000);
        driver.manage().window().maximize();

        AuthTesting.login(driver, "duyenle2072001@gmail.com", "duyen0207");
//        Thread.sleep(1000);
        String expectedUrl = "http://127.0.0.1:5000/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }

    @Test
    void Test3_playGame() throws InterruptedException {
        driver.manage().window().maximize();
        testPlayGame.testPlayGame(driver);
        String expectedURL = "http://127.0.0.1:5000/gamePage/3";
        String actualURL = driver.getCurrentUrl();

        Assertions.assertEquals(expectedURL, actualURL);

        driver.quit();
    }
}
