import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    static Map<String, List<Contact>> storage = new HashMap<>();

    public static Contact createContact(String name, String phone) {
        return new Contact(name, phone);
    }

    public boolean addGroup(String groupName) {
        if (storage.containsKey(groupName)) return false;
        storage.put(groupName, new ArrayList<>());
        return true;
    }

    public boolean addContact(Contact contact, String ... groupName) {
        for (String groupNames : groupName) {
            if (storage.containsKey(groupNames)) return false;
            storage.get(groupName).add(contact);
        }
        return true;
    }

    public List<Contact> getAllByGroups(String groupName) {
        return storage.get(groupName);
    }

    public static Contact getByPhone(String phone) {
        for (List<Contact> listContact : storage.values()) {
            for (Contact contact : listContact) {
                if (contact.getPhone().equals(phone)) {
                    return contact;
                }
            }
        }
        return null;
    }
}
