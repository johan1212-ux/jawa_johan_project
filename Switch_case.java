package johan;
import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter a number for food type");
		System.out.println("1)goan food");
		System.out.println("2)north indian food");
		System.out.println("3)south indian food");
		System.out.println("4)american food");
		System.out.println("5)mexican food");
		int food_type=s.nextInt();
			
		switch(food_type)
		{
		case 1:
			System.out.println("Goan food");
			break;
		case 2:
			System.out.println("north indian food");
			break;
		case 3:
			System.out.println("south indian food");
			break;
		case 4:
			System.out.println("thai food");
			break;
		case 5:
			System.out.println("american food");
			break;
			
		case 6:
			System.out.println("mexican food");
			break;
			
		default:
			System.out.println("invalid request!!!!!");
			break;
		
		}

	}

}
