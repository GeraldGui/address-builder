package com.pluralsight;

import java.util.Scanner;

public class Address {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        StringBuilder address = new StringBuilder();

        String fullName;

        String billingStreet;
        String billingCity;
        String billingState;

        String shippingStreet;
        String shippingCity;
        String shippingState;

        int billingZip;
        int shippingZip;

        System.out.println("Please provide the following information");

        System.out.print("Full name: ");
        fullName = myObj.nextLine();

        System.out.println(" ");

        System.out.print("Billing Street: ");
        billingStreet = myObj.nextLine();

        System.out.print("Billing City: ");
        billingCity = myObj.nextLine();

        System.out.print("Billing State: ");
        billingState = myObj.nextLine();

        System.out.print("Billing Zip: ");
        billingZip = myObj.nextInt();
        myObj.nextLine();

        System.out.println(" ");

        System.out.print("Shipping Street: ");
        shippingStreet = myObj.nextLine();

        System.out.print("Shipping City: ");
        shippingCity = myObj.nextLine();

        System.out.print("Shipping State: ");
        shippingState = myObj.nextLine();

        System.out.print("Shipping Zip: ");
        shippingZip = myObj.nextInt();
        myObj.nextLine();

        address.append(fullName);
        address.append("\n");
        address.append("\n");

        address.append("Billing Address: ");
        address.append("\n");
        address.append(billingStreet);
        address.append("\n");
        address.append(billingCity);
        address.append(", ");
        address.append(billingState);
        address.append(" ");
        address.append(billingZip);
        address.append("\n");
        address.append("\n");

        address.append("Shipping Address: ");
        address.append("\n");
        address.append(shippingStreet);
        address.append("\n");
        address.append(shippingCity);
        address.append(", ");
        address.append(shippingState);
        address.append(" ");
        address.append(shippingZip);

        /*address.append(fullName + "\n\n");

        address.append("Billing Address:\n" + billingStreet + "\n" + billingCity + ", " + billingState + " " + billingZip + "\n\n");

        address.append("Shipping Address:\n" + shippingStreet + "\n" + shippingCity + ", " + shippingState + " " + shippingZip);*/

        System.out.println(address.toString());

        myObj.close();
    }
}
