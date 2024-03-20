package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//span[contains(text(),'Случайная статья')])[1]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//span[contains(text(),'Статья')])[1]");
    }

}