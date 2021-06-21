package nidhi;

public class Switch_Case {

	public static void main(String[] args) {
		int x=2;
		System.out.println("press 1 for addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");
		System.out.println("press 5 for mod");
		switch(x)
		{
		case 1:
		{
			System.out.println(4+6);
			break;
		}
		case 2:
		{
			System.out.println(44-6);
			break;
		}
		case 3:
		{
			System.out.println(4*6);
			break;
		}
		case 4:
		{
			System.out.println(12/6);
			break;
		}
		case 5:
		{
			System.out.println(6/3);
			break;
		}
		default:
		{
			System.out.println("press valid input");
		}
		}
		
	}

}
