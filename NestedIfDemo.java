package controlstatement;
/*
 *
 * 
 * 
 * Rules of Nested if
 * check if statement value when true execute the value(inside of if and else checking process)
 * if statement value when false when execute of (outside value),(avoid the if move to  main else )
 * else(inside if )value false execute the else value 
 *   */

public class NestedIfDemo {

	public static void main(String[] args) {
		 int a =10;
		 int b =20;
		 int c =30;
		 if (a<7)
		 {
			 if(a>c)
			 {
				 System.out.println("a value is "+a);
			 }
			 else 
			 {
				 System.out.println("A value is smaller then b value ");
			 }
		 }
		 else
		 {
			 if(a>b)
			 {
				 System.out.println("A value (2)is"+a);
			 }
			 else
			 {
				 System.out.println("This value small to all of the  value ");
			 }
			 }
		 }
		 
		 
		 }
		 

	


