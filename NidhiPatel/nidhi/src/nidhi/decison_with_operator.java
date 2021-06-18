package nidhi;

public class decison_with_operator {

	public static void main(String[] args) {
		int x=4,y=5;
		if(x==4)
		{
			System.out.println("the value of x="+x);
		}
		else
		{
			System.out.println("the value of x is not 4");
		}
	
		if(x!=4)
		{
			System.out.println("the value of x is not 4");
		}
		else
		{
			System.out.println("the value of x is  4");
		}
		
		if(x<y)
		{
			System.out.println(" x is min number");
		}
		else
		{
			System.out.println("x is not less than y");
		}
			x=5;
		if(x<y)
		{
			System.out.println("true");
		}
		else  
		{
			System.out.println("flase");
		}
		if(x<y)
		{
			System.out.println("x < y");
		}
		else if(x==y)  
		{
			System.out.println("both same");
		}
		else
		{
			System.out.println("x>y");
		}
	}

}
