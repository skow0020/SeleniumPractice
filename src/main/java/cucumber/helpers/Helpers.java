package cucumber.helpers;

import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Created by Colin on 2/24/2017.
 */
public class Helpers {

    public WebElement HeadersHover(List<WebElement> hoverElements, String headerElement)
    {
        switch (headerElement)
        {
            case "Solutions":
            {
                return hoverElements.get(0);
            }
            case "About":
            {
                return hoverElements.get(1);
            }
            case "Explore":
            {
                return hoverElements.get(2);
            }
            case "Careers":
            {
                return hoverElements.get(3);
            }
            case "Contact Us":
            {
                return hoverElements.get(4);
            }
            default:
            {
                return null;
            }
        }
    }
}
