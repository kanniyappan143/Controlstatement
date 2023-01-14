package controlstatement;

import java.util.Scanner;

public class SwitchDemo 
{

	public static void main(String[] args)
	{
		int day;
		Scanner k=new Scanner(System.in);
		day=k.nextInt();
		switch(day)
		{
			case 1:
			{
				System.out.println("Day of Sunday");
				break;
			}
			case 2:
			{
				System.out.println("Day of monday");
				break;
			}
			case 3:
			{
				System.out.println("Day of tuesday");
				break;
			}
			case 4:
			{
				System.out.println("Day of wedbesday");
				break;
			}
			case 5:
			{
				System.out.println("Day of thuesday");
				break;	
			}
			case 6:
			{
				System.out.println("Day of friday");
				break;	
			}
			case 7:
			{
				System.out.println("Day of saturday");				
			}
			
		}
		
		}
		

	}


