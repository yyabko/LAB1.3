package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println("Знайти квадрат:");
        NumberSquare square = new NumberSquare(2,3);
        System.out.println();
        System.out.println("Трикутник:");
        Triangle triangle = new Triangle(4,5,6);
        System.out.println();
        System.out.println("Чотирикутник:");
        Quadrangle quadrangle = new Quadrangle(2,3,4,5);
        System.out.println();
        // Пошук квадрата
        System.out.println("Пошук квадрата:");
        var Square = new NumberSquare(2,3);
        var result = square.FindingTheSquareNumber();
        System.out.println("Area= "+result+ ";");
        //провірка на нуль
        System.out.println();
        System.out.println("Провірка на нуль:");
        square.TestValue(0,1);
        // Трикнут,площа периметер
        System.out.println();
        System.out.println("Трикнут,площа периметер:");
        var Triangle = new Triangle(4,5,6);
        triangle.Area(3,4,5);
        triangle.Perimeter();
        // Чотирикнут діагональ,інші сторони
        System.out.println();
        System.out.println("Чотирикнут діагональ, інші сторони:");
        var Quadrangle = new Quadrangle(2,3,4,5);
        quadrangle.solve();
        quadrangle.toString();
    }
}