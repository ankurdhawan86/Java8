package com.junit.passbyvalue;


public class DataObject {

    private char charValue;
    private String name;
    private int number;

    public char getCharValue() {
        return charValue;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setCharValue(char charValue) {
        this.charValue = charValue;

        charValue = 'X';
        System.out.println("\tUpdate charValue inside setCharValue, charValue=" + charValue);
    }

    public void setName(String name) {
        this.name = name;

        name = "Dummy" + name;
        System.out.println("\tUpdate name inside setName, name=" + name);
    }

    public void setNumber(int number) {
        this.number = number;

        number = number - 99;
        System.out.println("\tUpdate argument number inside setNumber, number=" + number);
    }

    @Override
    public String toString() {
        return "DataObject [number=" + number + ", charValue=" + charValue + ", name=" + name + "]";
    }

}