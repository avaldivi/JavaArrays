/* Adrianna Valdivia */

public class Fraction
{
	private int numerator;
	private int denominator;

	public Fraction()
	{
		this.numerator = 1;
		this.denominator = 1;
	}

	public Fraction(int denom)
	{
		this.numerator = 0;
		this.denominator = denom;
	}

	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator()
	{
		return numerator;
	}

	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}

	/**
	 * adds two fractions
	 *
	 * @param one
	 *            of the fractions to add
	 * @return the result of adding two fractions
	 */
	/**
	 * adds two fractions
	 *
	 * @param one
	 *            of the fractions to add
	 * @return the result of adding two fractions
	 */
	public Fraction add(Fraction f)
	{
		int num = numerator * f.getDenominator() + f.getNumerator()
				* denominator;
		int denom = denominator * f.getDenominator();
		Fraction result = new Fraction(num, denom);
		return result;
	}

	public Fraction subtract(Fraction f)
	{
		int num = numerator * f.getDenominator() - f.getNumerator()
				* denominator;
		int denom = denominator * f.getDenominator();
		Fraction result = new Fraction(num, denom);
		return result;
	}

	public Fraction multiply(Fraction f)
	{
		int num = numerator * f.getNumerator();
		int denom = denominator * f.getDenominator();
		Fraction result = new Fraction(num, denom);
		return result;
	}

	public Fraction divide(Fraction f)
	{
		int num = numerator * f.getDenominator();
		int denom = denominator * f.getNumerator();
		Fraction result = new Fraction(num, denom);
		return result;
	}

	@Override
	public String toString()
	{
		return getNumerator() + "/" + getDenominator();
	}

	// http://www.cs.gsu.edu/~cscyisx/2310/homework/Fraction.java
}
