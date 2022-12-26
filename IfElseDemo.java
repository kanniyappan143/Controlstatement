package controlstatement;
/*if else Statement
 * 
 * Syntax
 * 
 * if(condition)
 * {
 * 		Statement1;
 * }
 * 
 * else
 * {
 *   	Statement2;
 * }
 * Rules of if else 
 * 1. In if else Statement the condition was true then execute the Statement 1(inside of if)
 * 2.In if else Statement the condition was false then execute the Statement 2(inside of else)
 * else is provided not condition(false value only execute ) 
 *  
 * */
public class IfElseDemo 
{

	public static void main(String[] args)
	{
		int a=10;
		
		if(a<2)
	    {
	    	System.out.println("Correct A value is :"+a);
	    }
		if (a<20)
		{
			System.out.println("Correct value A is:"+a);
		}
		if(a<100)
		{
			System.out.println("A value is:"+a);
		}
		
		else
	    {
			System.out.println("value is false ");
	    }
	}

}
