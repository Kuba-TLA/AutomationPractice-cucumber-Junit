package pages;

public interface CommonPage {
    String XPATH_TEMPLATE_INPUT_BOX = "//input[@placeholder='%s']";
    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//div[contains(text(), '%s')]";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";

}
