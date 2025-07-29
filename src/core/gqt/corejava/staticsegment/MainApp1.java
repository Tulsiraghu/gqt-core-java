package core.gqt.corejava.staticsegment;

import java.util.Scanner;

class AdhaarCard {
    String name, phoneNumber, address;
    static String nationality = "Indian"; // static for all citizens

    void collectData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        name = sc.nextLine();

        System.out.println("Enter Phone Number:");
        phoneNumber = sc.nextLine();

        System.out.println("Enter Address:");
        address = sc.nextLine();
    }

    void display() {
        System.out.println("Nationality: " + nationality);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}

public class MainApp1{
    public static void main(String[] args) {
        AdhaarCard a1 = new AdhaarCard();
        AdhaarCard a2 = new AdhaarCard();
        AdhaarCard a3 = new AdhaarCard();

        System.out.println("----- Aadhaar Card - 1 -----");
        a1.collectData();
        a1.display();
        System.out.println("--------------");

        System.out.println("----- Aadhaar Card - 2 -----");
        a2.collectData();
        a2.display();
        System.out.println("--------------");


        System.out.println("----- Aadhaar Card - 3 -----");
        a3.collectData();
        a3.display();
        System.out.println("--------------");

    }
}
