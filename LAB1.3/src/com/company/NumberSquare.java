package com.company;

public class NumberSquare {
    int value;
    int powValue;

    public NumberSquare(int value, int powValue) {
        this.value = value;
        this.powValue = powValue;
        System.out.println("Значення: " + value + "" + ", Степінь: " + powValue + ";");
    }

    public int FindingTheSquareNumber() {
        return (int) Math.pow(value, powValue);
    }

    public void TestValue(int value, int powValue) {
        if (value == 0 || powValue == 0) {
            System.out.println("Numbers input error. ");
        } else {
            System.out.println("Good,the program will work. ");
        }
    }

}
