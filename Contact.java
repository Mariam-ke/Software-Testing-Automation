package Mobile_Application;

public class Contact {
    // Instance variables
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        
    	// Validate input parameters
        validateContactId(contactId);
        validateFirstName(firstName);
        validateLastName(lastName);
        validatePhone(phone);
        validateAddress(address);

        // Assign values to instance variables
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters for instance variables
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        
    	// Validate and update first name
        validateFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        
    	// Validate and update last name
        validateLastName(lastName);
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        
    	// Validate and update phone number
        validatePhone(phone);
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        
    	// Validate and update address
        validateAddress(address);
        this.address = address;
    }

    // Validation methods for input parameters
    private void validateContactId(String contactId) {
        if (contactId == null) {
            throw new IllegalArgumentException("Contact ID cannot be null");
        }
        if (contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID cannot exceed 10 characters");
        }
    }

    private void validateFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("First name cannot be null");
        }
        if (firstName.length() > 10) {
            throw new IllegalArgumentException("First name cannot exceed 10 characters");
        }
    }

    private void validateLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Last name cannot be null");
        }
        if (lastName.length() > 10) {
            throw new IllegalArgumentException("Last name cannot exceed 10 characters");
        }
    }

    private void validatePhone(String phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 digits");
        }
    }

    private void validateAddress(String address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        if (address.length() > 30) {
            throw new IllegalArgumentException("Address cannot exceed 30 characters");
        }
    }
    
    // Additional method to determine if the contact is active
    public boolean isActive() {
        
    	// logic to determine if the contact is active
        return true; // Example implementation, modify as needed
    }
    
    // Additional method to format the contact's full name
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
