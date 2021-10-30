package fop.w5phone;

public class Entry {
    public String firstName, lastName, phoneNumber;

    private Entry(String first, String last, String num)
    {
        firstName = first;
        lastName = last;
        phoneNumber = num;
    }
    public String getFirstName ()
    {
        return firstName;
    }
    public String getLastName ()
    {
        return lastName;
    }
    public String getPhoneNumber ()
    {
        return phoneNumber;
    }
}