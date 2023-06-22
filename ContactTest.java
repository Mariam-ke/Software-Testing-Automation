package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Mobile_Application.Contact;


public class ContactTest {

    @Test
    public void testValidContactId() {
        // Test a valid contact ID
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        Assertions.assertEquals("1234567890", contact.getContactId());
    }

    @Test
    public void testInvalidContactIdTooLong() {
        // Test an invalid contact ID that is too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        });
    }

    @Test
    public void testInvalidContactIdNull() {
        // Test an invalid contact ID that is null
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main Street, Anytown");
        });
        Assertions.assertEquals("Contact ID cannot be null", exception.getMessage());
    }
    
    @Test
    public void testSetFirstName() {
        // Test setting a valid first name
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        contact.setFirstName("Jane"); // Set a new valid first name
        Assertions.assertEquals("Jane", contact.getFirstName()); // Verify the first name is updated
    }


    @Test
    public void testInvalidFirstNameTooLong() {
        
    	// Test an invalid first name that is too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "JohnJohnJohnJohn", "Doe", "1234567890", "123 Main Street, Anytown");
        });
    }


    @Test
    public void testInvalidFirstNameNull() {
        
    	// Test an invalid first name that is null
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", null, "Doe", "1234567890", "123 Main Street, Anytown");
        });
    }
    
    @Test
    public void testSetLastName() {
        // Test setting a valid last name
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        contact.setLastName("Smith"); // Set a new valid last name
        Assertions.assertEquals("Smith", contact.getLastName()); // Verify the last name is updated
    }

    @Test
    public void testInvalidLastNameTooLong() {
        
    	// Test an invalid last name that is too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "DoeDoeDoeDoe", "1234567890", "123 Main Street, Anytown");
        });
    }

    @Test
    public void testInvalidLastNameNull() {
        
    	// Test an invalid last name that is null
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", null, "1234567890", "123 Main Street, Anytown");
        });
    }
    
    @Test
    public void testGetFullName() {
        // Test getting the full name
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        Assertions.assertEquals("John Doe", contact.getFullName()); // Verify the correct full name is returned
    }
    
    @Test
    public void testSetPhone() {
        // Test setting a valid phone number
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        contact.setPhone("9876543210"); // Set a new valid phone number
        Assertions.assertEquals("9876543210", contact.getPhone()); // Verify the phone number is updated
    }

    @Test
    public void testInvalidPhoneInvalidLength() {
        
    	// Test an invalid phone number with an invalid length
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "123456789", "123 Main Street, Anytown");
        });
        Assertions.assertEquals("Phone number must be exactly 10 digits", exception.getMessage());
    }


    @Test
    public void testInvalidPhoneNull() {
        
    	// Test an invalid phone number that is null
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", null, "123 Main Street, Anytown");
        });
    }
    
    @Test
    public void testSetAddress() {
        // Test setting a valid address
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        contact.setAddress("456 Elm Street"); // Set a new valid address
        Assertions.assertEquals("456 Elm Street", contact.getAddress()); // Verify the address is updated
    }
    
    @Test
    public void testGetAddress() {
        // Test getting the address
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        Assertions.assertEquals("123 Main Street, Anytown", contact.getAddress()); // Verify the correct address is returned
    }

    @Test
    public void testIsActive() {
        // Test the isActive() method
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown");
        Assertions.assertTrue(contact.isActive()); // Verify the contact is considered active (modify as needed)
    }

    @Test
    public void testInvalidAddressTooLong() {
        
    	// Test an invalid address that is too long
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "1234567890", "123 Main Street, Anytown 123 Main Street, Anytown");
        });
    }

    @Test
    public void testInvalidAddressNull() {
        
    	// Test an invalid address that is null
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "John", "Doe", "1234567890", null);
        });
    }
}
