import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class GmailDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\moshe.avidor\\IdeaProjects\\geckodriver.exe");


        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.il/maps/dir/%D7%A6%D7%99%D7%A8%D7%99%D7%9A,+%D7%A9%D7%95%D7%95%D7%99%D7%99%D7%A5%E2%80%AD/%D7%91%D7%90%D7%93%D7%9F-%D7%91%D7%90%D7%93%D7%9F,+%D7%92%D7%A8%D7%9E%D7%A0%D7%99%D7%94%E2%80%AD/@48.082734,8.7481372,9z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x47900b9749bea219:0xe66e8df1e71fdc03!2m2!1d8.541694!2d47.3768866!1m5!1m1!1s0x47971f4391f73145:0x630f291933f3c5c1!2m2!1d8.2285242!2d48.76564!3e0");


        driver.manage().window().maximize();


    }

}