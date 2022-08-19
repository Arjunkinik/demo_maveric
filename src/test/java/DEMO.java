
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import static java.lang.Thread.sleep;
public class DEMO {
    public static void main(String[] args) throws ParseException, InterruptedException {
        CharSequence firstName = "shirt";
        CharSequence lastName = "pants";
        System.setProperty("webdriver.edge.driver", "C:\\Users\\arjunkk\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

//
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        String max;
        double m=0,r=0;
        //No. of Columns
        List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total No of columns are : " +col.size());
        //No.of rows
        List<WebElement>  rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total No of rows are : " + rows.size());
        for (int i =1;i<rows.size();i++)
        {
            max= driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td[4]")).getText();
            NumberFormat f =NumberFormat.getNumberInstance();
            Number num = f.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);
            if(m>r)
            {
                r=m;
            }
        }
        System.out.println("Maximum current price is : "+ r);
        sleep(3000);
        driver.close();
    }

}
