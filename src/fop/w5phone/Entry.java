package fop.w5phone;

public class Entry {
    String firstName, lastName, phoneNumber;

    public Entry(String first, String last, String num)
    {
        firstName = first;
        lastName = last;
        phoneNumber = num;
    }
    public String getFirstName (Entry a)
    {
        return a.firstName;
    }
    public String getLastNameName (Entry a)
    {
        return a.lastName;
    }
    public String getPhoneNumber (Entry a)
    {
        return a.phoneNumber;
    }
}