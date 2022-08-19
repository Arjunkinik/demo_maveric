import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class p1 {
    public static void main(String[] args){

//        System.setProperty("\"webdriver.edge.driver\", \"C:\\Users\\arjunkk\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe\"");
//        WebDriver driver=new ChromeDriver();

        System.setProperty("webdriver.edge.driver", "C:\\Users\\arjunkk\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

//        WebElement viewKart = driver.findElement(By.xpath("*[@id=\"main\"]/div/ul/li[8]/div[2]/a[3]"));
        driver.navigate().to("https://google.com/");
//        WebDriver driver=new ChromeDriver();
        Actions acc = new Actions(driver);
        WebElement txtUsername = driver.findElement(By.name("q"));
        org.openqa.selenium.interactions.Action seriesOfActions = (Action) acc
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)
                .sendKeys(txtUsername, "hey google")

                .keyUp(txtUsername, Keys.SHIFT)
                .doubleClick(txtUsername)
                .contextClick()
                .build();
        seriesOfActions.perform() ;
    }
}
