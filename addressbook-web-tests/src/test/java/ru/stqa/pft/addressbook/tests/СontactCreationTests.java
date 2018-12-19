package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class СontactCreationTests extends TestBase{

    @Test
    public void testContactCreation() throws Exception {
        app.initContactCreation();
        app.fillContactForm(new ContactData("FirstName", "LastName", "Address", "9990001234", "qw@er.ty"));
        app.submitContactCreation();
    }

}