package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class СontactCreationTests extends TestBase{

    @Test
    public void testContactCreation() throws Exception {
        initContactCreation();
        fillContactForm(new ContactData("FirstName", "LastName", "Address", "9990001234", "qw@er.ty"));
        submitContactCreation();
    }

}