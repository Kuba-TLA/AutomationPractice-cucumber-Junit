package utils;

import io.cucumber.java.Scenario;
import io.cucumber.java.ca.Cal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CucumberLogUtils {
    private static Scenario currentScenario;

    public static void initScenario(Scenario scenario){
        currentScenario = scenario;
    }

    public static void logPass(String msg, boolean takeScreenshot){
        currentScenario.log(getLogTime() + "  PASS: " + msg);
        if(takeScreenshot){
            final byte[] screenshot = ((TakesScreenshot) WebDriverUtils.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            currentScenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    public static void logInfo(String msg, boolean takeScreenshot){
        currentScenario.log(getLogTime() + "  INFO: " + msg);
        if(takeScreenshot){
            final byte[] screenshot = ((TakesScreenshot) WebDriverUtils.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            currentScenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    public static void logFail(String msg, boolean takeScreenshot){
        currentScenario.log(getLogTime() + "  FAIL: " + msg);
        if(takeScreenshot){
            final byte[] screenshot = ((TakesScreenshot) WebDriverUtils.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            currentScenario.attach(screenshot, "image/png", "screenshot");
        }
    }

    public static String getLogTime(){
        String format = "yyy-MM-dd HH:mm:ss";
        DateFormat dateFormat = new SimpleDateFormat(format);
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }
}
