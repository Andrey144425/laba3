package com.company;

// класс ветеренара
public class Veterinarian {

    // метод лечения
    public void treatAnimal(Animal animal){
        System.out.printf("Еда: %s, Местоположение: %s \n", animal.getFood(), animal.getLocation());
    }

}
