
public class SandwichMaker
{

	public String[] ingredientsData()
	{
		String [] ingredientsArray = new String [10];
		for (int i = 0; i < ingredientsArray.length; i++)
		{
			ingredientsArray[i]  = "Ingredients" + i;
		}
		return ingredientsArray;
	}
	
	public String[]	condimentsData()
	{
		String [] condimentsArray = new String [5];
		for (int i = 0; i < condimentsArray.length; i++)
		{
			condimentsArray[i]  = "Condiments" + i;
		}
		return condimentsArray;
		
	}

	public static void main(String[] args)
	{
		SandwichMaker sM = new SandwichMaker();
		Sandwich[] sandwichArray = new Sandwich[5];
		
		String[] ingredientsArray0 =
		{"Steak", "Cheese", "Onions", "Tomato", "Pickles", 
				"Chicken Tenders", "Ham", "Lettuce", "Bread","Potato"};
		String[] condimentsArray0 =
		{ "Mayo", "Salt", "Mustard", "Ketchup, Pickles" };
		Sandwich s0 = new Sandwich(ingredientsArray0, condimentsArray0);
		sandwichArray[0] = s0;
		
		String[] ingredientsArray1 =
			{"Steak", "Cheese", "Onions", "Tomato", "Pickles", 
				"Chicken Tenders", "Ham", "Lettuce", "Bread","Potato"};
		String[] condimentsArray1 =
			{ "Mayo", "Salt", "Mustard", "Ketchup, Pickles" };
		Sandwich s1 = new Sandwich(ingredientsArray1, condimentsArray1);
		sandwichArray[1] = s1;
		
		String[] ingredientsArray2 =
			{"Steak", "Cheese", "Onions", "Tomato", "Pickles", 
				"Chicken Tenders", "Ham", "Lettuce", "Bread","Potato"};
		String[] condimentsArray2 =
			{ "Mayo", "Salt", "Mustard", "Ketchup, Pickles" };
		Sandwich s2 = new Sandwich(ingredientsArray2, condimentsArray2);
		sandwichArray[1] = s2;
		
		String[] ingredientsArray3 =
			{"Steak", "Cheese", "Onions", "Tomato", "Pickles", 
				"Chicken Tenders", "Ham", "Lettuce", "Bread","Potato"};
		String[] condimentsArray3 =
			{ "Mayo", "Salt", "Mustard", "Ketchup, Pickles" };
		Sandwich s3 = new Sandwich(ingredientsArray3, condimentsArray3);
		sandwichArray[3] = s3;
		
		String[] ingredientsArray4 =
			{"Steak", "Cheese", "Onions", "Tomato", "Pickles", 
				"Chicken Tenders", "Ham", "Lettuce", "Bread","Potato"};
		String[] condimentsArray4 =
			{ "Mayo", "Salt", "Mustard", "Ketchup, Pickles" };
		Sandwich s4 = new Sandwich(ingredientsArray4, condimentsArray4);
		sandwichArray[4] = s4;
		
		for (int i = 1; i < sandwichArray.length; i++)
		{
			String[] ingredientsArray = sM.ingredientsData();
			String[] condimentsArray = sM.condimentsData();
			Sandwich s = new Sandwich(ingredientsArray, condimentsArray);
			sandwichArray[i] = s;
		}
		
		for (Sandwich s: sandwichArray)
		{
			System.out.println(s);
		}
		
		
	}


	}


