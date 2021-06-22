package nidhi;

public class method_overloading {

	public static void main(String[] args) {

		method_overloading m1 = new method_overloading();
		m1.sum();
		m1.sum(4, 5);
		System.out.println(m1.sum(2));
	}
	public void sum() {
		int a = 5, b = 7;
		System.out.println(a + b);
	}
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	int sum(int a) {
		return (a + 5);
	}
}
