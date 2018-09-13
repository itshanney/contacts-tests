package com.tideworks.contacts.impl;

import com.tideworks.contacts.Contact;
import com.tideworks.contacts.ContactsDataStore;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Simple implementation of the {@link ContactsDataStore} backed by a Map
 *
 * @author tideworks
 * @since 0.2.0
 */
public class BasicContactsDataStore implements ContactsDataStore {

    private final Map<UUID, Contact> contactsStore;

    public BasicContactsDataStore() {
        super();

        contactsStore = new HashMap<>();
    }

    /**
     * Deletes a Contact from the data store
     * @param contact {@link Contact} to delete
     */
    public void delete(Contact contact) {
        if(contact != null) {
            contactsStore.remove(contact.getContactId());
        }
    }

    /**
     * Gets a Contact with the given ID
     * @param contactId {@link UUID} identifying the Contact
     * @return Contact matching the ID, or null if not found
     */
    public Contact getContactById(final UUID contactId) {
        return contactsStore.getOrDefault(contactId, null);
    }

    /**
     * Inserts the Contact into the data store
     * @param contact {@link Contact} to insert
     * @return Contact that was just inserted
     */
    public Contact insert(Contact contact) {
        contactsStore.put(contact.getContactId(), contact);
        return contact;
    }

    /**
     * Updates the Contact in the data store
     * @param contact {@link Contact} to update
     * @return Contact that was just updated
     */
    public Contact update(Contact contact) {
        if(contact != null) {
            contactsStore.put(contact.getContactId(), contact);
        }

        return null;
    }
}
