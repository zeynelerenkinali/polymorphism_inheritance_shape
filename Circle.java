public class Circle extends Shape
{
	private int radius; // encapsuled variable
	public Circle(String color, String name, int radius)// Constructor
	{
		super(color, name);
		this.radius = radius;
	}
	@Override
	public void calculateArea() 
	{
		double result = Math.PI * Math.pow(radius, 2);
		setResult(result);
	}
	@Override
	public String toString() 
	{
		return super.toString() + "\nRadius: " + getRadius() + "\nArea: " + String.format("%.2f", super.getResult());
	}
	// get set methods
	public int getRadius()
	{
		return this.radius;
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}

}
