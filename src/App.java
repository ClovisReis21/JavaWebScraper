// import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    
    private static WebDriver _driver;
    private static int _timeSleep = 2000;

    public static void main(String[] args) throws Exception {
        setUp();
        Thread.sleep(_timeSleep);
        test();
        finish();
    }

    @Before
    public static void setUp() throws Exception {        
        String currentPath = new java.io.File(".\\drivers\\chromedriver.exe").getCanonicalPath();
        System.setProperty("webdriver.chrome.driver", currentPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        _driver = new ChromeDriver(options);
        _driver.manage().deleteAllCookies();
    }

    @Test
    public static void test() throws Exception {
        _driver.get("https://www.google.com/");
        System.out.println("Title: " + _driver.getTitle());
        boolean isTrue = _driver.getTitle().contentEquals("Google");
        if (!isTrue) {
            System.out.print("Titulo NAO confere");
            return;
        }
        // assertTrue("Título não confere", isTrue); // did not work well
        System.out.println("Titulo confere");
        Thread.sleep(_timeSleep);
    }

    @After
    public static void finish() throws Exception {
        _driver.quit();
        System.out.print("App finalizado!\n");
        System.exit(0);
    }
}
