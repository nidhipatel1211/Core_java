package corejava;

public class final_keyword {
	final int x = 10;
 final int y;
 
	public int getX() {
		return x;
	}

	public final_keyword(int y) {
		super();
		this.y = y;
	}
	
	public int getY() {
		return y;
	}

	public static void main(String[] args) {
		final_keyword f1=new final_keyword(20);
		System.out.println(f1.getX());
		System.out.println(f1.getY());
	}

}
