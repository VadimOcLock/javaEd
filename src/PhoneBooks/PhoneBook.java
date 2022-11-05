package PhoneBooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private List<Contact> contacts;
    private HashMap<String, List<Contact>> groups;

    public PhoneBook() {
        contacts = new ArrayList<>();
        groups = new HashMap<>();
    }

    public PhoneBook(List<Contact> contacts) {
        this.contacts = contacts;
        groups = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact))
            contacts.add(contact);
    }

    public Contact getContact(String number) {
        for (Contact contact : contacts) {
            if(Objects.equals(contact.getPhoneNumber(), number))
                return contact;
        }
        return null;
    }

    public Contact getContact(String number, String groupName) {
        var contactList = groups.get(groupName);
        if (contactList != null) {
            for (Contact contact : contactList) {
                if (Objects.equals(contact.getPhoneNumber(), number))
                    return contact;
            }
        }
        return null;
    }

    public void addGroup(String groupName, List<Contact> contactList) {
        if (!groups.containsKey(groupName))
            groups.put(groupName, contactList);
    }

    public List<Contact> getGroup(String groupName) {
        return groups.get(groupName);
    }

    public void deleteGroup(String groupName) {
            groups.remove(groupName);
    }
}

