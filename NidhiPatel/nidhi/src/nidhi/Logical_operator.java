package nidhi;

public class Logical_operator {

	public static void main(String[] args) {
		boolean x=true;
		boolean y=false;
		if(x && y)
		{
			System.out.println("x and y both true");
		}
		else
		{
			System.out.println("either x or y are false");
		}
		if(x || y)
		{
			System.out.println("either x or y are true");
		}
		else
		{
			System.out.println("both x and y are false");
		}
		if(x != y)
		{
			System.out.println("both x and y are not same");
		}
		else
		{
			System.out.println("both x and y are same");
		}
	}

}
