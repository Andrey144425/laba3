package com.company;

// класс кошка, наследуемся от класса животного
public class Cat extends Animal{
    double lengthJump;

    // пустой конструктор
    Cat(){
        super();
        lengthJump = 0;
    }

    // конструктор с параметрами
    Cat(String food, String location, double lengthJump){
        super(food, location);
        this.lengthJump = lengthJump;
    }

    // геттеры класса
    public double getLengthJump() {
        return lengthJump;
    }

    // перегрузка методов
    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает!!!");
    }

    @Override
    public void eat() {
        System.out.println("Кошка есть корм");
    }

    @Override
    public void display() {
        System.out.printf("Еда: %s, Местоположение: %s, Высота прыжка: %f \n", getFood(), getLocation(), getLengthJump() );
    }
}
