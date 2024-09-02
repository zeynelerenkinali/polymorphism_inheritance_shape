public class Square extends Shape
{
	private int side;
	public Square(String color, String name, int side)// constructor
	{
		super(color, name);
		this.side = side;
	}
	@Override
	public void calculateArea()
	{
		int result = side*side;
		setResult(result);;
	}
	@Override
	public String toString()// toString is a default addition from java when we call it in the main, because of that we are using this name and adding into our text and when we want to print that at main, only thing we will do is writing the name of shape it will start this method initially.
	{
		return super.toString() + "\nSide: " + getSide() + "\nArea: " + (int)super.getResult();
	}
	// get set methods
	public int getSide()
	{
		return this.side;
	}
	public void setSide(int side)
	{
		this.side = side;
	}
}
