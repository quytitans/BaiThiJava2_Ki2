package MainPackage;

import MainPackage.Unity.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainThread {
    static Scanner scanner = new Scanner(System.in);
    public static Map<String, Person> hashMap = new HashMap();

    public static void main(String[] args) {
        while (true) {
            System.out.println("-----------Adressbook-----------");
            System.out.println("1 - Add new contact");
            System.out.println("2 - Find a contact by name");
            System.out.println("3 - Display contacts");
            System.out.println("4 - Exit");
            System.out.println("----------------------");
            System.out.println("Please ente your choice (from 1 - 4): ");
            int choice = 0;
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("add new contact");
                    addContact();
                    break;
                case 2:
                    if (hashMap == null) {
                        System.out.println("addressbook empty please add information fist !!! slect 1");
                        break;
                    }
                    System.out.println("please enter person's name you want to find:");
                    String nameFind = scanner.nextLine();
                    Set<String> keySet = hashMap.keySet();
                    for (String key : keySet) {
                        Person person = hashMap.get(key);
                        if (person.getName().equals(nameFind)) {
                            System.out.println("the person's you want to find is: ");
                            System.out.println(String.format("|%10s%15s%10s|%10s%20s%10s|",
                                    "", "Contact Name", "",
                                    "", "Phone number", ""
                            ));
                            System.out.println(person.toString());
                        } else {
                            System.out.println("Not found");
                        }
                    }
                    scanner.nextLine();
                    break;
                case 3:
                    if (hashMap == null) {
                        System.out.println("addressbook empty please add information fist !!! slect 1");
                        break;
                    }
                    System.out.println(String.format("|%10s%15s%10s|%10s%20s%10s|",
                            "", "Contact Name", "",
                            "", "Phone number", ""
                    ));
                    Set<String> keySet2 = hashMap.keySet();
                    for (String key : keySet2) {
                        Person person = hashMap.get(key);
                        System.out.println(person.toString());
                    }
                    scanner.nextLine();
                    break;
                default:
                    break;
            }
            if (choice == 4) {
                break;
            }
        }
    }

    public static void addContact() {
        Person person = new Person();
        System.out.println("enter him/her ID: ");
        String ID = scanner.nextLine();
        System.out.println("enter him/her name: ");
        String name = scanner.nextLine();
        System.out.println("enter him/her Phone number: ");
        String phoneNumber = scanner.nextLine();
        person.setID(ID);
        person.setName(name);
        person.setPhoneNumber(phoneNumber);
        if (hashMap.containsKey(person.getID())) {
            System.out.println("This person is already in the contacts");
            return;
        } else {
            hashMap.put(person.getID(), person);
        }
    }
}
