package nidhi;

public class nested_loop {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1;i<5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		for(i=1;i<5;i++)
		{
			for(j=i;j<5;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		for(i=1;i<10;i=i+2)
		{
			for(j=1;j<=i;j=j+2)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
