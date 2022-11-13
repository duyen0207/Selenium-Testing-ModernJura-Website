import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthTesting {
    public static void login(WebDriver driver, String email, String password) throws InterruptedException {
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

        WebElement Email = driver.findElement(By.name("email"));
        WebElement Password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));

        Email.sendKeys(email);
        Password.sendKeys(password);

        Thread.sleep(3000);
        login.click();

    }

    public static void register(WebDriver driver, String email, String username, String password, String repass) throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Register here')]")).click();

        WebElement Email = driver.findElement(By.name("email"));
        WebElement Username = driver.findElement(By.name("userName"));
        WebElement Password = driver.findElement(By.name("password1"));
        WebElement Repass = driver.findElement(By.name("password2"));

        WebElement register = driver.findElement(By.xpath("//button[contains(text(),'Sign-up')]"));

        Email.sendKeys(email);
        Username.sendKeys(username);
        Password.sendKeys(password);
        Repass.sendKeys(repass);

        Thread.sleep(3000);
        register.submit();
    }
}
