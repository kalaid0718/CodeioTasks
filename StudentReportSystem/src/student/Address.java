package student;

public class Address {
    String city;
    String state;

    // Constructor
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Method to display address details
    public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

