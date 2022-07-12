public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addGroup("Home");

        fillGroups(phoneBook);
        fillContact(phoneBook);
    }
    private static void fillGroups(PhoneBook phoneBook) {
        phoneBook.addGroup("Home");
        phoneBook.addGroup("Work");
        phoneBook.addGroup("Friends");
        phoneBook.addGroup("Family");
    }

    private static void fillContact(PhoneBook phoneBook) {
        phoneBook.addContact(phoneBook.createContact("Ruslan", "977126929"), "Home");
        phoneBook.addContact(phoneBook.createContact("Mariya", "977126939"), "Family");
        phoneBook.addContact(phoneBook.createContact("Alex", "977126939"), "Friends");
    }

}
