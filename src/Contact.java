import java.util.Objects;

public class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(Contact.class)) return false;
        Contact con = (Contact) obj;
        return name.equals(con.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "[ " + name + phone + " ]";
    }

    public String getPhone() {
        return phone;
    }

}
