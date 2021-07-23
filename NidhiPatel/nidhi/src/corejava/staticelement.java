package corejava;

public class staticelement {
	 static int a=0;

		public static int getA() {
			return a;
		}

		public static void count() {
			a++;
		}

		public static void main(String[] args) {
			staticelement s = new staticelement();
			System.out.println("current value " + s.getA());
			s.count();
			System.out.println("current value " + s.getA());
			staticelement s1 = new staticelement();
			s.count();
			System.out.println("current value " + s1.getA());
			s.count();
			System.out.println("current value " + s1.getA());
		

	}

}
