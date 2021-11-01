package fop.w5phone;

public class PhoneBook {

    private Entry[] entries;

    public PhoneBook (Entry[] a) {
        entries = a;
    }

//    public String find(String firstname, String lastname) {
//        String out = null;
//        int start = 0;
//        int end = entries.length - 1;
//        while (start <= end) {
//            int middle = (start + end) / 2;
//            int compare = lastname.compareTo(entries[middle].getLastName());
//            if (compare == 0) {
//                compare = firstname.compareTo(entries[middle].getFirstName());
//                if (compare == 0) {
//                    out = entries[middle].getPhoneNumber();
//                    break;
//                } else if (compare < 0)
//                    end = middle - 1;
//                else
//                    start = middle + 1;
//            } else if (compare < 0) {
//                end = middle - 1;
//
//            } else {
//                start = middle + 1;
//            }
//        }
//        return out;
//
//    }

//    public String find(String firstname, String lastname) {
//        String out = null;
//        int start = 0;
//        int end = entries.length - 1;
//        while (start <= end) {
//            int middle = (start + end) / 2;
//            int compare = lastname.compareTo(entries[middle].getLastName());
//            if (compare == 0) {
//                compare = firstname.compareTo(entries[middle].getFirstName());
    // anu raxan firstname is compsac igive shedarebebi unda uqna tu lastnamebi udris , mashin firstname is compp ze gadacvli aq
    // da mere qvemot sheadareb , anu qveda if ebs miewodeba an lastnamebis comp an tu lastnamebi tolia
    // firstnamebis comp da am yvelafris mere out shi sul daimaxsovrebs middle is phonenumber s .
//            }  if (compare < 0) {
//                end = middle - 1;
//
//            } if( compare > 0) {
//                start = middle + 1;
//            }
//            out = entries[middle].getPhoneNumber();
//        }
//        return out;
//
//    }

    public String find(String firstname, String lastname) {
        String out = null;
        int start = 0;
        int end = entries.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            int compare = lastname.compareTo(entries[middle].getLastName());
            if (compare == 0) {
                compare = firstname.compareTo(entries[middle].getFirstName());
//                if (compare == 0) {
//                    return  entries[middle].getPhoneNumber();
//
//                }  aqac mosula mara wvalebaa aq if .

            }  if (compare < 0) {
                end = middle - 1;

            } if(compare > 0) {
                start = middle + 1;
            }
            return entries[middle].getPhoneNumber();
        }
        return null;

    }

}

