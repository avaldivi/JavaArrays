import java.util.Arrays;


public class CatTester
{

	public static void main(String[] args)
	{
		Cat[] gatoArray = new Cat[10];
		Cat gato0 = new Cat("Pretty", "Exotic Shorthair", 4 , 1999);
		gatoArray[0] = gato0;
		Cat gato1 = new Cat("Tammy", "Ragdoll", 8 , 2000);
		gatoArray[1] = gato1;
		Cat gato2 = new Cat("TomTom", "Abyssinian", 4 , 2005);
		gatoArray[2] = gato2;
		Cat gato3 = new Cat("Jerry", "Siamese", 3 , 2008);
		gatoArray[3] = gato3;
		Cat gato4 = new Cat("Mickey", "Main Coon", 4 , 1999);
		gatoArray[4] = gato4;
		Cat gato5 = new Cat("Twinkle", "Exotic Shorthair", 8 , 2003);
		gatoArray[5] = gato5;
		Cat gato6 = new Cat("Jungle", "Scottish Fold", 4 , 2001);
		gatoArray[6] = gato6;
		Cat gato7 = new Cat("Beans", "Russian Blue", 2 , 1999);
		gatoArray[7] = gato7;
		Cat gato8 = new Cat("Princess", "Sphynx", 1 , 2012);
		gatoArray[8] = gato8;
		Cat gato9 = new Cat("Joker", "Persian", 1 , 2004);
		gatoArray[9] = gato9;
		System.out.println("List of Cats");
		for (int i = 0; i < gatoArray.length; i++)
		{
			System.out.println(gatoArray[i]);
		}
		System.out.println("\nList of Cats born after 2004 and have more than 3 legs");
		for (int i = 0; i < gatoArray.length; i++)
		{
			if (gatoArray[i].getYearBorn() > 2004 && gatoArray[i].getNumberOfLegs() > 3)
				System.out.println(gatoArray[i]);
		}
		
		System.out.println("\nSorted Cats");
		Arrays.sort(gatoArray);
		for (int i = 0; i < gatoArray.length && gatoArray[i] != null; i++)
		{
				System.out.println(gatoArray[i]);
		}
	}
}
