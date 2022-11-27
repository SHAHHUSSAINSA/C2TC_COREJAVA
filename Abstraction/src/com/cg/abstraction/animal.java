package com.cg.abstraction;

public abstract class animal {

	abstract void eat();

	}

	class Herbivores extends animal

	{

	void eat()

	{

	System.out.println("I am a vegetarian");

	}

	}

	class Carnivores extends animal

	{

	void eat()

	{

	System.out.println("I am non-vegetarian");

	}

	}

	class Omnivores extends animal

	{

	void eat()

	{

	System.out.println("I will eat both veg and non-veg");

	}

	}

	