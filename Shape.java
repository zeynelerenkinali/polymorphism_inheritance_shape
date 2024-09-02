public class Shape 
{
	private String color, name; // encapsulated variable
	private double result = 0; // encapsulated variable
	public Shape(String color, String name)// Constructor
	{
		this.color = color;
		this.name = name;
	}
	public void calculateArea()  // will be overriden by subclasses
	{
		System.out.println("This method calculates area used for overriding for each shape");
	}
	public String toString()
	{
		return "--------------\nObject: " + getName() + "\nColor: "+ getColor();
	}
	// get set methods
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getResult()
	{
		return this.result;
	}
	public void setResult(double result)
	{
		this.result = result;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
