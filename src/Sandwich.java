/* Adrianna Valdivia */

import java.util.Arrays;

public class Sandwich
{
	private String[] ingredientsArray;
	private String[] condimentsArray;
	
	public Sandwich(String[] ingredientsArray, String[] condimentsArray)
	{
		this.ingredientsArray = ingredientsArray;
		this.condimentsArray = condimentsArray;
	}

	public String[] getIngredients()
	{
		return ingredientsArray;
	}

	public void setIngredients(String[] ingredientsArray)
	{
		this.ingredientsArray = ingredientsArray;
	}

	public String[] getCondiments()
	{
		return condimentsArray;
	}

	public void setCondiments(String[] condimentsArray)
	{
		this.condimentsArray = condimentsArray;
	}

	@Override
	public String toString()
	{
	        return "Sandwich Ingredients ="
					+  Arrays.toString(ingredientsArray)
					+ ", Condiments ="
					+ Arrays.toString(condimentsArray);
	}
	
}
