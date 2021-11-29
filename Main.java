package com.company;

public class Main {

    // основная программа
    public static void main(String[] args) {
        // создаем массив из 3 разных животных
	    Animal[] arr = new Animal[3];
	    arr[0] = new Dog("Meat", "Home", "Black");
	    arr[1] = new Cat("Fish", "Street", 3.0);
        arr[2] = new Horse("Sugar", "Farm", 120);
        Veterinarian vet = new Veterinarian();
        // в цикле отправляем их к ветеринару
        for(int i = 0; i < arr.length; i++)
            vet.treatAnimal(arr[i]);
    }
}
