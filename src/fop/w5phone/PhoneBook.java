package fop.w5phone;

public class PhoneBook {

    public Entry [] entries;

    public Entry[] getEntries() {
        return entries;
    }
    public String find (String firstname, String lastname)
    {
        String out =null;
        int start = 0 ;
        int end = entries.length - 1;
        while (start <= end)
        {
            int middle = (start+end)/2;
            int compare = lastname.compareTo(entries[middle].getLastName());
            if(compare == 0)
            {
                compare = firstname.compareTo(entries[middle].getFirstName());
                if(compare == 0) {
                   out =  entries[middle].getPhoneNumber();
                    break;
                }
                else if(compare < 0)
                    end = middle -1;
                else
                    start = middle +1;
            }
            else if(compare < 0)
            {
                end = middle -1 ;

            }
            else {
                start = middle +1;
            }
        }
        return out;

    }
//    public int find0(int start, int end,String firstname,String lastname)
//    {
//        if(lastname.compareTo(entries[(start+end)/2].getLastName()) < 0)
//        {
//
//        }
//    }
}