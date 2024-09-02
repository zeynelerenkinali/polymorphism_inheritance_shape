public class Triangle extends Shape
{
	private int base, height; // encapsuled variables
	Triangle(String color, String name, int base, int height)// Constructor
	{
		super(color, name);
		this.base = base;
		this.height = height;
	}
	@Override
	public void calculateArea()
	{
		int result = (base * height) / 2;
		setResult(result);
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nBase: " + getBase() + "\nHeight: " + getHeight() + "\nArea: " + (int)super.getResult();
	}
	// get set methods
	public int getBase()
	{
		return this.base;
	}
	public void setBase(int base)
	{
		this.base = base;
	}
	public int getHeight()
	{
		return this.height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
}
