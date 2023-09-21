package src.main.java.Challenges.ExPracticePt3;

import java.util.Arrays;

public class ContactManager {
    
    private Contact[] contacts;


    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        this.contacts = Arrays.copyOf(contacts,contacts.length);
    }


    public Contact getContacts(int index) {
        Contact copy = new Contact(this.contacts[index]);
        return copy;
    }

    public void setContacts(Contact contacts, int index) {
        Contact copy = new Contact(contacts);
        this.contacts[index] = copy;
    }

}
