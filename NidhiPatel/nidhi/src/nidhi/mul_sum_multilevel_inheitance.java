package nidhi;

public class mul_sum_multilevel_inheitance extends sum_multilevel_inheritance {

	public mul_sum_multilevel_inheitance(int a, int b) {
		super(a, b);
	}

	void mul() {
		System.out.println(a * b);
	}

	public static void main(String args[]) {
		mul_sum_multilevel_inheitance m1 = new mul_sum_multilevel_inheitance(5, 6);
		m1.mul();
	}
}
