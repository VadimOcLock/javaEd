package PhoneBooks;

import java.util.*;

public class PhoneBook {
    private HashMap<String,Contact> contacts;
    private HashMap<String, ContactsGroup> groups;

    public PhoneBook() {
        contacts = new HashMap<>();
        groups = new HashMap<>();
    }

    public PhoneBook(List<Contact> contacts) {
        this.contacts = new HashMap<>();
        groups = new HashMap<>();

        for (Contact contact : contacts) {
            this.contacts.put(contact.getPhoneNumber(), contact);
        }
    }

    public void addContact(Contact contact) {
        if (!contacts.containsKey(contact.getPhoneNumber()))
            this.contacts.put(contact.getPhoneNumber(), contact);
    }

    public Contact getContact(String number) {
        return contacts.get(number);
    }

    public HashMap<String, Contact> getContacts(String groupName) {
        return groups.get(groupName).getContacts();
    }

    public void addGroup(String groupName, List<Contact> contactList) {
        if (contactList == null)
            groups.put(groupName, new ContactsGroup(groupName));
        if (!groups.containsKey(groupName))
            groups.put(groupName, new ContactsGroup(groupName, contactList));
    }

    public void deleteGroup(String groupName) {
        groups.remove(groupName);
    }

    public void addContactToGroup(String phoneNumber, String groupName) {
        groups.get(groupName).addContact(contacts.get(phoneNumber));
    }

    public ContactsGroup getGroup(String groupName) {
        return groups.get(groupName);
    }
}

