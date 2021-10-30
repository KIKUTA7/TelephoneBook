package fop.w5phone;

public class Entry {
    private  String firstName, lastName, phoneNumber;

    public Entry(String first, String last, String num)
    {
      if(first != "")  firstName = first;
      if(last != "")  lastName = last;
      if(num != "")  phoneNumber = num;
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