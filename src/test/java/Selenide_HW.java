import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

//- Откройте страницу Selenide в Github

//- Перейдите в раздел Wiki проекта

//- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

//- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

public class Selenide_HW {
    @Test
    void selenideTestHW(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("soft");
        $$(".Box-row").findBy(visible).shouldHave(text("SoftAssertions")).click();


        sleep(5000);
    }
}
