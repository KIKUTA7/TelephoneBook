package fop.w5phone;

public class Entry {

    private String firstName, lastName, phoneNumber;

    public Entry(String first, String last, String num) {
         this.firstName = first;
         this.lastName = last;
         this.phoneNumber = num;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}