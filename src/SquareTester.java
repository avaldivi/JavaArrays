
public class SquareTester
{
	public static void main(String[] args)
	{
		Square[] arraySq = new Square[5];
		Square sq0 = new Square(3.0);
		arraySq[0] = sq0;
		Square sq1 = new Square(6.0);
		arraySq[1] = sq1;
		Square sq2 = new Square(9.0);
		arraySq[2] = sq2;
		Square sq3 = new Square(12.0);
		arraySq[3] = sq3;
		Square sq4 = new Square(15.0);
		arraySq[4] = sq4;
		
		for (int i = 0; i < arraySq.length; i++)
		{
			System.out.println(arraySq[i]);
		}	
	}
}
