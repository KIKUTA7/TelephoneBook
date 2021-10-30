package fop.w5phone;

public class Entry {
    public static String firstName, lastName, phoneNumber;

    public Entry(String first, String last, String num)
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