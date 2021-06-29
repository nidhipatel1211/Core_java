package nidhi;

public class sum_multilevel_inheritance extends multi_level_inheritance {

	public sum_multilevel_inheritance(int a, int b) {
		super(a, b);
		a = 6;
		b = 7;
	}

	public void cal() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// multi_level_inheritance m1=new multi_level_inheritance(2, 3);
		sum_multilevel_inheritance ss = new sum_multilevel_inheritance(6, 7);
		ss.cal();

	}

}
