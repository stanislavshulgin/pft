package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class СontactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().createContact(new ContactData("FirstName", "LastName", "Address", "9990001234", "qw@er.ty", "test1"));
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }

}