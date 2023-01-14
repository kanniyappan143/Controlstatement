package controlstatement;
import java.util.Scanner;
public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner jk=new Scanner(System.in);
		System.out.println("********Menu********");
		System.out.println("1.Names");
		System.out.println("2.Address");
		System.out.println("3.Marks");
		
		System.out.println("Enter your choice");
		int a=jk.nextInt();
		
		System.out.println("--------------------------------------");
		switch(a)
		{
		case 1:
		{
		System.out.println("Kanniyappan");
		System.out.println("Selva");
		System.out.println("Gobi");
		break;
		}
		case 2:
		{
		System.out.println("Tindivanam");
		System.out.println("gingee");
		System.out.println("tiruvanamalai");
		break;
		}
		case 3:
		{
			System.out.println("90");
			System.out.println("95");
			System.out.println("92");
			break;
		}
	}

	}
}
