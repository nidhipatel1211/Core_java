package nidhi;

public class method_types {

	public static void main(String[] args) {

		method_types m1 = new method_types();
		m1.add();
		m1.sub(6, 3);
		System.out.println(m1.mul(2,4));
		System.out.println(m1.div());
	}
	public void add() {
		int a = 5, b = 6;
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}
	int div() {
		return(6/3);
	}
	int mul(int a,int b) {
		return (a*b);
	}

}
