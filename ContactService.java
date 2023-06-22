package Mobile_Application;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private final List<Contact> contacts;

    public ContactService() {
        this.contacts = new ArrayList<>();
    }

     // Adds a contact to the contact list.
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

// Retrieves a contact by contact ID.
    public Contact getContact(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null;
    }

    // Deletes a contact from the contact list.
    public boolean deleteContact(String contactId) {
        return contacts.removeIf(contact -> contact.getContactId().equals(contactId));
    }

    // Updates a specific field of a contact.
    public boolean updateContactField(String contactId, String fieldName, String fieldValue) {
        Contact contact = getContact(contactId);
        if (contact != null) {
            switch (fieldName) {
                case "firstName":
                    contact.setFirstName(fieldValue);
                    break;
                case "lastName":
                    contact.setLastName(fieldValue);
                    break;
                case "number":
                    contact.setPhone(fieldValue);
                    break;
                case "address":
                    contact.setAddress(fieldValue);
                    break;
                default:
                    return false;
            }
            return true;
        }
        return false;
    }

    // Retrieves a list of all contacts.
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contacts);
    }

    // Retrieves a list of contacts with a matching first name.
    public List<Contact> getContactsByFirstName(String firstName) {
        List<Contact> matchingContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName)) {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }

    // Retrieves a list of contacts with a matching last name.
    public List<Contact> getContactsByLastName(String lastName) {
        List<Contact> matchingContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }

     // Retrieves a list of contacts with a matching phone number.
    public List<Contact> getContactsByPhoneNumber(String phoneNumber) {
        List<Contact> matchingContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phoneNumber)) {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }
}
