package nidhi;

public class circle_inheritance extends inheritance_example {

	public circle_inheritance() {
		super();
		radius = 3;
	}

	void area() {
		System.out.println(3.14 * radius * radius);
	}

	public static void main(String[] args) {
		//single_level_inheritance s1 = new single_level_inheritance();
		circle_inheritance c1 = new circle_inheritance();
		c1.area();
	}

}
