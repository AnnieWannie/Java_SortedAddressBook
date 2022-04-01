package ca.humber;

import java.util.Scanner;

/**
 *
 * @author BADBADWUTSGOOD
 */
public class AddressBook {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contact[] contacts = new Contact[20];
        String fNameEntry;
        String lNameEntry;
        String eMailEntry;
        long phoneNumberEntry;

        System.out.println("The CPAN 131 Address book can store up to " + contacts.length + " contacts.\n"
                + "Please enter your contact's first name, lastname, email, and phone number.");

        for (var i = 0; i < contacts.length; i++) {

            System.out.print("\nContact " + (i + 1) + ": ");

            fNameEntry = scan.next();
            lNameEntry = scan.next();
            eMailEntry = scan.next();
            phoneNumberEntry = scan.nextLong();

            contacts[i] = new Contact(fNameEntry, lNameEntry, eMailEntry, phoneNumberEntry);
            System.out.println("\nYour contacts list is currently\n");
            sortContactList(contacts);
            printContactList(contacts);
        }

    }

    public static void sortContactList(Contact[] contacts) {
        for (var i = 0; i < (contacts.length - 1); i++) {
            if (contacts[i] == null) 
                break;
            
            for (var z = i + 1; z < contacts.length; z++) {
                int counter = 0;
                int tracker = z;
                int shorterNameLen;
                do {                                    
                    if (contacts[tracker] == null)
                        break;                   
                    String nameCompare1 = contacts[i].getLName();
                    String nameCompare2 = contacts[tracker].getLName();

                    char compareContact1 = nameCompare1.charAt(0);
                    char compareContact2 = nameCompare2.charAt(0);
                    
                    if (nameCompare1.length() < nameCompare2.length()){
                     shorterNameLen = nameCompare1.length();  
                    } else {
                        shorterNameLen = nameCompare2.length();
                    }
                    
                    while (compareContact1 == compareContact2 && counter < shorterNameLen-1) {
                        compareContact1 = nameCompare1.charAt(counter + 1);
                        compareContact2 = nameCompare2.charAt(counter + 1);
                        counter += 1;
                    }

                    if (compareContact2 < compareContact1) {
                        Contact compareContactTemp = contacts[i];
                        contacts[i] = contacts[tracker];
                        contacts[tracker] = compareContactTemp;
                        tracker = z;
                    }
                    tracker += 1;
                } while (tracker < contacts.length);
            }
        }
    }

    public static void printContactList(Contact[] contacts) {
        for (var i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                break;
            }
            contacts[i].printContact();
            System.out.println(" ");
        }
    }
}
