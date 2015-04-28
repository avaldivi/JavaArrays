/* Adrianna Valdivia */

public class Square
{
	private double length;

	public Square(double length)
	{
		this.length = length;
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double getArea()
	{
		return Math.pow(this.length, 2);
	}
	
	public double getPerimeter()
	{
		return 4*this.length;
	}
	
	public double getDiagonal()
	{
		double i = Math.pow(this.length, 2) + Math.pow(this.length, 2);
		return Math.sqrt(i);
	}

	@Override
	public String toString()
	{
		return "Square [ Length = " + length + ", Area = " + getArea() + ", Perimeter = "
				+ getPerimeter() + ", Diagonal = " + getDiagonal() + "]";
	}
}
