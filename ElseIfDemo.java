package controlstatement;
/*else if Statement
 * 
 * Syntax
 * 
 * if(condition 1)
 * {
 *   Statement 1;
 * }
 * 
 *   else if(condition 2)
 *   {
 *   Statement 2;
 *   }
 *   
 *   else if(condition 3)
 *   {
 *   Statement 3;
 *   }
 *   
 *   else if(condition n)
 *   {
 *   Statement n;
 *   }
 *   
 *   else
 *   {
 *     final Statement;
 *   }
 *   
 *   
 *   Rules
 *   
 *   1.If Condition was true then execute the Statement 1
 *   
 *   2. if condition was not true then check the else if condition one by one if its can be true then the true Statement
 *   
 *    3.the else if condition also wrong then execute the else part ..
 *   
 * */
 import java.util.*;
public class ElseIfDemo 
{

	public static void main(String[] args)
	{
		int colour;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number show RGB :");
		colour=s.nextInt();
		if (colour==0)
		{
			System.out.println("colour of Red");
		}
		else if (colour==1)
		{
			System.out.println(" colour of green");
		}
		else if (colour==2)
		{
			System.out.println("colour of blue");
		}
		else 
		{
			System.out.println("Your input was wrong ");
		}
	
	}

	}

