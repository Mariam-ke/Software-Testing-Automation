package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import Mobile_Application.Contact;
import Mobile_Application.ContactService;

public class ContactServiceTest {
    private ContactService contactService;

    @Before
    public void setup() {
        contactService = new ContactService();
    }

    @Test
    public void testGetAllContacts() {
        // Test retrieving all contacts from the contact service
        Contact contact1 = new Contact("1234567890", "John", "Doe", "1234567890", "Address 1");
        Contact contact2 = new Contact("9876543210", "Jane", "Smith", "9876543210", "Address 2");

        contactService.addContact(contact1);
        contactService.addContact(contact2);

        List<Contact> allContacts = contactService.getAllContacts();

        Assert.assertEquals(2, allContacts.size());
        Assert.assertTrue(allContacts.contains(contact1));
        Assert.assertTrue(allContacts.contains(contact2));
    }

    @Test
    public void testGetContactsByFirstName() {
        // Test retrieving contacts by first name
        Contact contact1 = new Contact("1234567890", "John", "Doe", "1234567890", "Address 1");
        Contact contact2 = new Contact("9876543210", "John", "Smith", "9876543210", "Address 2");
        Contact contact3 = new Contact("5678901234", "Jane", "Doe", "5678901234", "Address 3");

        contactService.addContact(contact1);
        contactService.addContact(contact2);
        contactService.addContact(contact3);

        List<Contact> johnContacts = contactService.getContactsByFirstName("John");

        Assert.assertEquals(2, johnContacts.size());
        Assert.assertTrue(johnContacts.contains(contact1));
        Assert.assertTrue(johnContacts.contains(contact2));
    }

    @Test
    public void testGetContactsByLastName() {
        // Test retrieving contacts by last name
        Contact contact1 = new Contact("1234567890", "John", "Doe", "1234567890", "Address 1");
        Contact contact2 = new Contact("9876543210", "Jane", "Doe", "9876543210", "Address 2");
        Contact contact3 = new Contact("5678901234", "John", "Smith", "5678901234", "Address 3");

        contactService.addContact(contact1);
        contactService.addContact(contact2);
        contactService.addContact(contact3);

        List<Contact> doeContacts = contactService.getContactsByLastName("Doe");

        Assert.assertEquals(2, doeContacts.size());
        Assert.assertTrue(doeContacts.contains(contact1));
        Assert.assertTrue(doeContacts.contains(contact2));
    }

    @Test
    public void testGetContactsByPhoneNumber() {
        // Test retrieving contacts by phone number
        Contact contact1 = new Contact("1234567890", "John", "Doe", "1234567890", "Address 1");
        Contact contact2 = new Contact("9876543210", "Jane", "Smith", "9876543210", "Address 2");
        Contact contact3 = new Contact("5678901234", "John", "Doe", "5678901234", "Address 3");

        contactService.addContact(contact1);
        contactService.addContact(contact2);
        contactService.addContact(contact3);

        List<Contact> johnDoeContacts = contactService.getContactsByPhoneNumber("1234567890");

        Assert.assertEquals(1, johnDoeContacts.size());
        Assert.assertTrue(johnDoeContacts.contains(contact1));
    }
}
