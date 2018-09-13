package com.tideworks.contacts;

import java.util.UUID;

/**
 * Domain model that defines a Contact for use in a mobile phone
 *
 * @author justin.hanney (jhanney)
 * @since 0.1.0
 */
public class Contact {

    private final UUID contactId;
    private String firstName, lastName;
    private String phone, email;

    public Contact() {
        super();
        contactId = UUID.randomUUID();
    }

    public UUID getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
