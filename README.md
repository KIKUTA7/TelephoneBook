This assignment is meant to realize binary search in a telephone book. The structure of the program is visualized by the following class diagram:

PhoneBooklassendiagramm

The entries of the telephone book are sorted ascending to the second names. If the second names of two entries are equal, the respective entries should be sorted according to the first (given) names. The ordering of sorting corresponds to the ordering realized by the method int compareTo(String otherString) of the class String. Thereby, a.compareTo(b) returns a negative value, when the String a is lexikographically smaller than b, a positive value, when a is lexikographically greater than b, and 0 if a and b represent the same sequence of characters (see, e.g., the [official documentation of this method](https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/String.html#compareTo(java. lang.String)). The files Entry.java and PhoneBook.java do already exist. It is your task to realize the corresponding classes as follows.

 Class Entry 3 of 4 tests passing
Realize the class Entry with object attributes lastName, firstName and phoneNumber as Strings. Create also the getters getFirstName(), getLastName() and getPhoneNumber(). Realize a constructor Entry(String firstName, String lastName, String phoneNumber) which initializes the corresponding object attributes appropriately. Take care that the order of arguments is according to the description.
 Class PhoneBook 3 of 3 tests passing
Realize the class PhoneBook which maintains Entry objects in an array entries. Create a constructor which accepts an array of Entry objects and initializes the corresponding attribute accordingly. You may assume that the provided argument array is different from null, non-empty and already sorted. Moreover, all entries as well as all attributes of entries are non-null, where each combination of name and given name may occur at most once.
 Binary Search in the Phone Book 0 of 1 tests passing
Add to PhoneBook a method public String find(String firstName, String lastName) which searches for the phone number corresponding to the provided arguments by means of binary search the entries maintained by the PhoneBook object. Again take care that the order of parameters matters. You may assume that bots parameters are non-null. If the entry searched for in the phone book, is absent, the value null should be returned. For this assignment, realize binary search iteratively (i.e., with a loop) instead of recursively!
Example for 3.: the following code fragment should return true.

Entry[] entries = new Entry[5];
entries[0] = new Entry("Agathe", "Ackermann", "555-11133322");
entries[1] = new Entry("Bernd", "Ackermann", "555-2251243");
entries[2] = new Entry("Winfried", "Becker", "555-225123");
entries[3] = new Entry("Alex", "Dieß", "555-343112");
entries[4] = new Entry("Beatrix", "Dieß",  "555-2123123");
PhoneBook phoneBook = new PhoneBook(entries);
// Here, the output should be true:
System.out.println(entries[0].getPhoneNumber().equals(phoneBook.find("Agathe", "Ackermann")));
Hints:

Use the method int compareTo(String otherString) of class String for comparing strings.
As imports, only packages from java.lang.* are permitted.
Take care that you use precisely the method and attribute names given the specification.
The behavioral tests are only performed, once all structural tests are passed. Before that, you receive for behavioral tests, the message "Test was not executed.".
