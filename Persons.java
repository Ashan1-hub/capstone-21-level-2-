
// Create a class called Persons to store a person's details
public class Persons {

    // Create attributes for your class
    public String name;
    public String surname;
    private int telephoneNumber;
    private String emailAddress;
    public String physicalAddress;

    // Create a constructor for your class
    public Persons(String name, String surname, int telephoneNumber, String emailAddress, String physicalAddress){
        this.name = name;
        this.surname = surname;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }

    // Create a method to display the person's details
    public String toString() {
        String output = "Name: " + name;
        output += "\nTelephone number: " + telephoneNumber;
        output += "\nEmail address:" + emailAddress;
        output += "\nPhysical Address:" + physicalAddress;

        return output;}

    // Create your setters and getters
    public String getSurname() {
        return surname;
    }
    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}








