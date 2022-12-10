package com.bridgelabz;

public class AddressBook {
    String firstName;
    String lastName;
    String city;
    String state;
    String email;
    int zip;
    long phoneNo;

    public void setDetails(){
        firstName = "Prince";
        lastName = "Kumar";
        city = "Arrah";
        state = "Bihar";
        email = "princek2530@gmail.com";
        zip = 802301;
        phoneNo = 9155222544L;
    }
    public void printDetails(){
        System.out.println("First Name:- " + firstName);
        System.out.println("Last Name:- " + lastName);
        System.out.println("City:- " + city);
        System.out.println("State:- " + state);
        System.out.println("email ID:- " + email);
        System.out.println("ZIP Code:- " + zip);
        System.out.println("Phone Number:- " + phoneNo);
    }
}
