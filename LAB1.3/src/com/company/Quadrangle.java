package com.company;

public class Quadrangle {
    double a;
    double b;
    double c;
    double d;

    public Quadrangle(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        System.out.println("Перший кут: " + a + "" + ", Другий кут: " + b + ", Третій кут: " + c + ", Четрертий кут:" + d + ";");
    }

    public void solve() {
        double dig = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Diagonal =" + dig);
    }

    public String toString() {
        double dig = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Other side = " + Math.sqrt(Math.pow(dig, 2) - Math.pow(a, 2)));
        return null;
    }

}