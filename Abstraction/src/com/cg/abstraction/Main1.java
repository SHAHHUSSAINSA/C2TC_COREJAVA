package com.cg.abstraction;

public class Main1 {

	public static void main(String[] args) {
		
			animal goat = new Herbivores();

			animal tiger = new Carnivores();

			animal bear = new Omnivores();

			goat.eat();

			tiger.eat();

			bear.eat();

			}

			
	}

