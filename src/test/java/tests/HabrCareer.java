package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class HabrCareer extends BaseTest {


    @Test
    @DisplayName("Проверка заголовка страницы")
    void habrCareerTitle() {
        assertThat(title()).contains("Работа и свежие вакансии для IT специалистов от прямых работодателей — Хабр Карьера");
    }
    @Test
    @DisplayName("Корректный переход на страницу с параметрами")
    void habrCareerSearchForm() {
        String urlWithParamsJava = "https://career.habr.com/vacancies?q=Java&l=1&type=all";

        $(".l-page-title__input").setValue("Java");
        $(".l-page-title__form-submit").click();
        assertThat(url()).contains(urlWithParamsJava);

    }
}
