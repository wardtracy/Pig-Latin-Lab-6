import javax.naming.Name;

public class Contact {

    private String name;
    private String email;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact() {

    }

    public Contact(String name, String email, int phoneNumber) {

    }

    public String toString (){

        return "Name";
    }
}

