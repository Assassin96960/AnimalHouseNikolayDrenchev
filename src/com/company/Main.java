package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AnimalHouse<Fish> fishHouse = new AnimalHouse<Fish>();
        AnimalHouse<Snake> snakeHouse= new AnimalHouse<Snake>();
        Snake snake =new Snake(200);
        Fish fish = new Fish("Ribok");
        fishHouse.setAnimal(fish);
        snakeHouse.setAnimal(snake);
        System.out.println((snakeHouse.getAnimal()).getLength());
    }
}
