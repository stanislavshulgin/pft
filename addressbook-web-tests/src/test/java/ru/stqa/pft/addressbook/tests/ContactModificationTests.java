package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification(){
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("FirstName", "LastName", "Address", "9990001234", "qw@er.ty", null), false);;
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
    }
}
