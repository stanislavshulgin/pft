package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper {
    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void login(String username, String password) {
        wd.get("http://localhost/addressbook/");
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.id("content")).click();
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }
}