package corejava;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {

		System.out.println("enter your name");
		Scanner in=new Scanner(System.in);
		String name=in.next();
		in.close();
		System.out.println("welcome "+name);
	}

}
