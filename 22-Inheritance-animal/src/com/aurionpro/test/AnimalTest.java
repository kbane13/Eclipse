package com.aurionpro.test;

import com.aurionpro.model.Animal;
import com.aurionpro.model.Cow;
import com.aurionpro.model.Lion;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animals = new Animal("Wild Animal", true);
		System.out.println(animals);

		animals.eat();

        //cow
		Cow cows = new Cow("Domestic animal", false);
		System.out.println(cows);
		cows.eat();
		System.out.println("name of animal is :" + cows.getName());
		System.out.println("Is Carnivorous:" + cows.isCarnivorous());
        //lion
		Lion lions = new Lion("Wild Animal", true);
		System.out.println(lions);
		System.out.println("name of animal is :" + lions.getName());
		System.out.println("Is Carnivorous:" + lions.isCarnivorous());

		lions.eat();
	}

}
