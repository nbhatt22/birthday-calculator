import java.util.Scanner;

public class whosOlder 
{

	public static void main(String[] args) 
	{
		Scanner santa = new Scanner(System.in);
		System.out.println("Please enter the first person's birth year: ");
		String StrYear1 = santa.nextLine();
		int year1 = Integer.parseInt(StrYear1);
		System.out.println("Please enter the first person's birth month: ");
		String StrMonth1 = santa.nextLine();
		int month1 = Integer.parseInt(StrMonth1);
		System.out.println("Please enter the first person's birth day: ");
		String StrDay1 = santa.nextLine();
		int day1 = Integer.parseInt(StrDay1);
		System.out.println("Please enter the second person's birth year: ");
		String StrYear2 = santa.nextLine();
		int year2 = Integer.parseInt(StrYear2);
		System.out.println("Please enter the second person's birth month: ");
		String StrMonth2 = santa.nextLine();
		int month2 = Integer.parseInt(StrMonth2);
		System.out.println("Please enter the second person's birth day: ");
		String StrDay2 = santa.nextLine();
		int day2 = Integer.parseInt(StrDay2);
		
		if (year1>year2)
		{
			System.out.println("The second person is older.");
		}
		else if (year2>year1)
		{
			System.out.println("The first person is older.");
		}
		else 
		{
			if (month1>month2)
			{
				System.out.println("The second person is older.");
			}
			else if(month2>month1)
			{
				System.out.println("The first person is older.");
			}
			else
			{
				if (day1>day2)
				{
					System.out.println("The second person is older. ");
				}
				else if (day2>day1)
				{
					System.out.println("The first person is older.");
				}
				else
				{
					System.out.println("They are the exact same age.");
				}
			}
		}
	}

}

