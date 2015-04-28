
public class GradeTester
{
	public static void main(String[] args)
	{
		Grade[]	arrayGrade = new Grade[15];
		Grade g0 = new Grade(4.0);
		arrayGrade[0]= g0;
		Grade g1 = new Grade(3.7);
		arrayGrade[1]= g1;
		Grade g2 = new Grade(3.3);
		arrayGrade[2]= g2;
		Grade g3 = new Grade(3.0);
		arrayGrade[3]= g3;
		Grade g4 = new Grade(2.7);
		arrayGrade[4]= g4;
		Grade g5 = new Grade(2.3);
		arrayGrade[5]= g5;
		Grade g6 = new Grade(2.0);
		arrayGrade[6]= g6;
		Grade g7 = new Grade(1.7);
		arrayGrade[7]= g7;
		Grade g8 = new Grade(1.3);
		arrayGrade[8]= g8;
		Grade g9 = new Grade(1.0);
		arrayGrade[9]= g9;
		Grade g10 = new Grade(0.6);
		arrayGrade[10]= g10;
		Grade g11 = new Grade(0.7);
		arrayGrade[11]= g11;
		Grade g12 = new Grade(0.5);
		arrayGrade[12]= g12;
		Grade g13 = new Grade(0.0);
		arrayGrade[13]= g13;
		Grade g14 = new Grade(0.3);
		arrayGrade[14]= g14;
		
		for (int i = 0; i < arrayGrade.length; i++)
		{
			System.out.println(arrayGrade[i]);
		}	
	}
}
