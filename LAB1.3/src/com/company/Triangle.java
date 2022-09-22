package com.company;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Перший кут: " + a +  ", Другий кут: " + b + ", Третій кут: " + c + ";");
    }

    public void Area(int a, int b , int c) {
        double p1 = (a + b + c) / 2.0;
        System.out.println("Area: "+ (int)Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c)));
    }

    public void Perimeter() {
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Ці сторони не можуть зробити трикутник");
        } else {
            System.out.println("Perimeter:" + (a + b + c));
        }

    }
}
