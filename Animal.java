package com.company;


// класс Animal
public class Animal {

    // поля класса
    private String food;
    private String location;

    // пустой конструктор
    public Animal() {
        this.food = "";
        this.location = "";
    }

    // конструктор с параметрами
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    // геттеры класса
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    // методы
    public void makeNoise() {
        System.out.println("Такое то животное издает звук");
    }

    public void eat() {
        System.out.println("Такое то животное ест");
    }

    public void sleep() {
        System.out.println("Такое то животное спит");
    }

    // функция вывода информации о животном
    public void display() {
        System.out.printf("Еда: %s, Местоположение: %s \n", getFood(), getLocation());
    }





}
