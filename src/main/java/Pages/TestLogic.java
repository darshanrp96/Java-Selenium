package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Clock;

public class TestLogic {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.lambdatest.com/login");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);

        driver.findElement(By.id("#email")).sendKeys("Darshan");
        driver.close();
    }
}
