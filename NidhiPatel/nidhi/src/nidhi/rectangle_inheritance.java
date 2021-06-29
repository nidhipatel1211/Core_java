package nidhi;

public class rectangle_inheritance extends inheritance_example {

	public rectangle_inheritance() {
		super();
		height = 5;
		weight = 8;
	}

	public void area() {
		System.out.println(height * weight);
	}

	public static void main(String[] args) {
		rectangle_inheritance r1 = new rectangle_inheritance();
		r1.area();
	}

}
