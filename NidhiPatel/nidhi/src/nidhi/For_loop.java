package nidhi;

public class For_loop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		int i=1;
		for(;i<5;i++)
		{
			System.out.println(i);
		}
		i=10;
		for(;;i--)
		{
			System.out.println(i);
			if(i<=1)
				break;
		}
		i=10;
		for(;;)
		{
			System.out.println(i);
			if(i<=1)
				break;
			i--;
		}
	}

}
