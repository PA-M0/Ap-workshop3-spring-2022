public class Contact {
    //fields
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Address address;

    public void setGroup(String group) {
        if (group.equals("")) {
            this.group = "(not saved)";
        }
        else {
            this.group = group;
        }
    }

    public void setEmail(String email) {
        if (email.equals("")) {
            this.email = "(not saved)";
        }
        else {
            this.email = email;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName.equals("")) {
            this.firstName = "(not saved)";
        }
        else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.equals("")) {
            this.lastName = "(not saved)";
        }
        else {
            this.lastName = lastName;
        }
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void printContact(){
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Group: " + group);
        System.out.println(phoneNumber.toString());
        System.out.println("Email: " + email);
        System.out.println(address.toString());
    }
}
