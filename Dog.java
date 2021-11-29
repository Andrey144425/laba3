package com.company;

// класс собака, наследуемся от класса животного
public class Dog extends Animal{
    String color;

    // пустой конструктор
    Dog(){
        super();
        color = "";
    }

    // конструктор с параметрами
    Dog(String food, String location, String color){
        super(food, location);
        this.color = color;
    }

    // геттеры класса
    public String getColor() {
        return color;
    }

    // перегрузка методов
    @Override
    public void makeNoise() {
        System.out.println("Собака лает!!!");
    }

    @Override
    public void eat() {
        System.out.println("Собака есть корм");
    }

    @Override
    public void display() {
        System.out.printf("Еда: %s, Местоположение: %s, Цвет: %s \n", getFood(), getLocation(), getColor() );
    }
}
