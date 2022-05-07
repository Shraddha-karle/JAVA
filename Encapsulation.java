package com.company;

public class Encapsulation {
    private String FirstName;
    private String LastName;
    private String CreditCard;
    private int id;
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(String creditCard) {
        CreditCard = creditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
