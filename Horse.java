package com.company;

// класс лошадь, наследуемся от класса животного
public class Horse extends Animal{
    double speed;

    // пустой конструктор
    Horse(){
        super();
        speed = 0;
    }

    // конструктор с параметрами
    Horse(String food, String location, double speed){
        super(food, location);
        this.speed = speed;
    }

    // геттеры класса
    public double getSpeed() {
        return speed;
    }

    // перегрузка методов
    @Override
    public void makeNoise() {
        System.out.println("Лошадь топает!!!");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест корм");
    }

    @Override
    public void display() {
        System.out.printf("Еда: %s, Местоположение: %s, Скорость: %f \n", getFood(), getLocation(), getSpeed() );
    }
}
