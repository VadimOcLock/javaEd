package PhoneBooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb1 = new PhoneBook();

        Contact contact1 = new Contact("Vadim", "+7 999 999 99 99");
        Contact contact2 = new Contact("Olga", "+7 999 999 99 98");
        Contact contact3 = new Contact("Dima", "+7 999 999 99 97");

        pb1.addContact(contact1);
        pb1.addContact(contact1);
        pb1.addContact(contact2);
        pb1.addContact(contact3);

        List<Contact> familyContacts = new ArrayList<>();
        familyContacts.add(contact1);
        familyContacts.add(contact2);

        pb1.addGroup("Friends", null);

        pb1.addGroup("Family", familyContacts);

        pb1.addContactToGroup(contact1.getPhoneNumber(), "Friends");

        pb1.deleteGroup("IncorrectGroupName");

        PhoneBook pb2 = new PhoneBook(familyContacts);
    }
}
