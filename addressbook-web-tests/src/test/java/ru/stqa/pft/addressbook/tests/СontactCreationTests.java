package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class СontactCreationTests extends TestBase{

    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("FirstName", "LastName", "Address", "9990001234", "qw@er.ty"));
        app.getContactHelper().submitContactCreation();
    }

}