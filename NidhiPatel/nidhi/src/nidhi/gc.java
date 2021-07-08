package nidhi;

public class gc {
	static int i=1;
void add() {
	System.out.println("hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gc g1=new gc();
		gc g2=new gc();
		g1.add();
		g2.add();
		System.gc();
	}
	protected void finalize()
	{
		i++;
		System.out.println(i);
		
	}

}
