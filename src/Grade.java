/* Adrianna Valdivia */

public class Grade
{
	private double numberGrade;

	public Grade(double numberGrade)
	{
		this.numberGrade = numberGrade;
	}

	public double getNumberGrade()
	{
		return numberGrade;
	}

	public String getLetterGrade()
	{
		if (this.numberGrade == 4.0)
			return "A";
		else if (this.numberGrade == 3.7)
			return "A-";
		else if (this.numberGrade == 3.3)
			return "B+";
		else if (this.numberGrade == 3.0)
			return "B";
		else if (this.numberGrade == 2.7)
			return "B-";
		else if (this.numberGrade == 2.3)
			return "C+";
		else if (this.numberGrade == 2.0)
			return "C";
		else if (this.numberGrade == 1.7)
			return "C-";
		else if (this.numberGrade == 1.3)
			return "D+";
		else if (this.numberGrade == 1.0)
			return "D";
		else if (this.numberGrade == 0.7)
			return "D-";
		else if (this.numberGrade == 0.3 || this.numberGrade == 0.0)
			return "F";
		
		return "-1";
		
	}

	@Override
	public String toString()
	{
		return "Grade [Number Grade = " + getNumberGrade()
				+ ", Letter Grade = " + getLetterGrade() + "]";
	}
	
	
}
