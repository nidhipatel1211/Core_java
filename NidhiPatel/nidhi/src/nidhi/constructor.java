package nidhi;

public class constructor {

	public static void main(String[] args) {

		constructor c1 = new constructor();
		constructor c2 = new constructor(3);
		constructor c3 = new constructor(c2);
		c1.show();
		c2.show();
		c3.show();
	}

	int a;

	// default constructor
	public constructor() {
		a = 0;
	}

	// parameterize constructor
	public constructor(int a) {
		this.a = a;
	}

	public void show() {
		System.out.println(a);

	}

	// copy constructor
	public constructor(constructor c1) {
		a = c1.a;
	}
}
