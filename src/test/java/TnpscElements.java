import org.openqa.selenium.WebElement;
import java.util.List;
public class TnpscElements extends Tnpscscript{
    public void elementPrint()
    {
        System.out.println(driver);
        List<WebElement> list= Tnpscscript.printList(driver);
        System.out.println(list.size());
        for (WebElement webElement : list) {
            String name = webElement.getText();
            System.out.println(name);
            }

        }}
