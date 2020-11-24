package examples;

public class Duck
{


	private String name;
	private int lifeExpectancy;
	private String favouriteFood;

	public Duck(String name, int lifeExpectancy, String favoriteFood) 
	{
		super();
		this.name = name;
		this.lifeExpectancy = lifeExpectancy;
		this.favouriteFood = favoriteFood;
	}

	void waddle()
	{
		lifeExpectancy++;
		System.out.println(this.name + " is waddling");

	}

	void quack()
	{
		System.out.println("quack quack");
	}

	@Override
	public String toString() 
	{
		return "My name is " + name + "I like to eat " + favouriteFood + "lifeExpectancy: " + lifeExpectancy;

	}
}


