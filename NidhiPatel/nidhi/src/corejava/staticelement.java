package corejava;

public class staticelement {
	static int a = 0;

	public static int getA() {
		return a;
	}

	public static void count() {
		a++;
	}

	public static void main(String[] args) {

		System.out.println("current value " + staticelement.getA());
		staticelement.count();
		System.out.println("current value " + staticelement.getA());

		staticelement.count();
		System.out.println("current value " + staticelement.getA());
		staticelement.count();
		System.out.println("current value " + staticelement.getA());

	}

}
