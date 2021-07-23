package corejava;

public class static_innercls1 {
	private static void testingomethod()
	{
		System.out.println("you are in outer class");
	}
	public static class Inner
	{ public static int x=5;
		public static void testingmethod()
		{
			System.out.println("you are in inner static class");
			testingomethod();
		}
		
	}

}
