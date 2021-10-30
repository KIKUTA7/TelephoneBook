package fop.w5phone;

public class Entry {
    public String firstName, lastName, phoneNumber;

    public Entry(String first, String last, String num)
    {
        firstName = first;
        lastName = last;
        phoneNumber = num;
    }
     String getFirstName ()
    {
        return firstName;
    }
     String getLastName ()
    {
        return lastName;
    }
     String getPhoneNumber ()
    {
        return phoneNumber;
    }
}