public class Rectangle extends Shape	
{
	private int width, height; // encapsuled variables
	public Rectangle(String color, String name, int width, int height)// Constructor
	{
		super(color, name);
		this.width = width;
		this.height = height;
	}
	@Override
	public void calculateArea()
	{
		int result = height * width;
		setResult(result);
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nWidth: " + getWidth() + "\nHeight: " + getHeight() + "\nArea: " + (int)super.getResult();
	}
	// get set methods
	public int getWidth()
	{
		return this.width;
	}
	public void setWidth(int width)
	{
		this.width = width;
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
