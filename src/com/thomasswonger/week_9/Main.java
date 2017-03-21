package com.thomasswonger.week_9;


abstract class Contact {
    protected String name;

    Contact(String name){
        this.name = name;
    }

    abstract public void contact();

}

class EmailContact extends Contact {
    protected String email;

    EmailContact(String name, String email){
        super(name);
        this.email = email;
    }

    @Override
    public void contact(){
        System.out.println("Emailing " + email);
    }

}

class PhoneContact extends Contact {
    protected String phoneNumber;

    PhoneContact(String name, String phoneNumber){
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact(){
        System.out.println("Calling " + phoneNumber);
    }
}

public class Main {

    public static void main (String[] args){
        EmailContact emailcontact = new EmailContact("Tommy", "Tommy@Tommy.com");

        emailcontact.contact();

        PhoneContact phoneContact = new PhoneContact("Tommy", "12342145");

        phoneContact.contact();
    }
}
