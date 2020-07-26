package com.mainacad;

import org.openqa.selenium.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class Lab
{

    public static void main( String[] args ) throws InterruptedException {
        open("https://demoqa.com/automation-practice-form");
        Thread.sleep(1000);

        System.out.println($(".main-header").text());
        Thread.sleep(1000);

        $(By.id("firstName")).setValue("Halyna");
        Thread.sleep(1000);

        $(By.id("lastName")).setValue("Prytuliak");
        Thread.sleep(1000);

        $(By.id("userEmail")).setValue("galka.prit@gmail.com");
        Thread.sleep(1000);

        $(By.xpath("//*[text()='Female']")).click();
        Thread.sleep(1000);

        $(By.id("userNumber")).setValue("0976063327");
        Thread.sleep(1000);
        //$(By.cssSelector("input#dateOfBirthInput")).click();
        //$(By.cssSelector(".react-datepicker__month-select")).setValue("September").pressEnter();
        //$(By.cssSelector(".react-datepicker__year-select")).setValue("1991").pressEnter();
        //$(By.cssSelector(".react-datepicker__day--011")).click();

        $(byId("dateOfBirthInput")).click();
        Thread.sleep(1000);

        $(byCssSelector(".react-datepicker__tab-loop"));
        $(byCssSelector(".react-datepicker__month-select")).click();
        $(byCssSelector(".react-datepicker__month-select"));
        $(byCssSelector("[value='1']")).click();
        Thread.sleep(1000);

        $(byCssSelector(".react-datepicker__year-select")).click();
        $(byCssSelector(".react-datepicker__year-select"));
        $(byCssSelector("[value='1991']")).click();
        Thread.sleep(1000);

        $(byCssSelector(".react-datepicker__week:nth-child(2) .react-datepicker__day:nth-child(2)")).click();
        Thread.sleep(1000);

        $(By.xpath("/html//input[@id='subjectsInput']")).sendKeys("Eng");
        $(By.xpath("/html//input[@id='subjectsInput']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        $(byId("currentAddress")).setValue("Keletska");

        $(By.xpath("//label[contains(.,'Reading')]")).click();

        $(By.xpath("/html//input[@id='react-select-3-input']")).sendKeys("Har");
        $(By.xpath("/html//input[@id='react-select-3-input']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        $(By.xpath("/html//input[@id='react-select-4-input']")).sendKeys("Kar");
        $(By.xpath("/html//input[@id='react-select-4-input']")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        $(By.id("submit")).click();
        Thread.sleep(1000);

        $(By.id("closeLargeModal")).click();
    }
}
