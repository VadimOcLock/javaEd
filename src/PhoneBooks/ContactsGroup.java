package PhoneBooks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ContactsGroup {
    private String groupName;
    private HashMap<String, Contact> contacts;

    public ContactsGroup(String groupName) {
        this.groupName = groupName;
        this.contacts = new HashMap<>();
    }

    public ContactsGroup(String groupName, List<Contact> contacts) {
        this.groupName = groupName;
        this.contacts = new HashMap<>();
        if (contacts != null) {
            for (Contact contact : contacts) {
                this.contacts.put(contact.getPhoneNumber(), contact);
            }
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public HashMap<String, Contact> getContacts() {
        return this.contacts;
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getPhoneNumber(), contact);
    }
}
