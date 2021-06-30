package nidhi;

public class multipleinheritance implements interface1_multipleinheritance,interface_multipleinheritance{
public void add()
{
	System.out.println(a+b);
}
public void sub()
{
	System.out.println(a-b);
}
	public static void main(String[] args) {
		multipleinheritance m1=new multipleinheritance();
		m1.add();
		m1.sub();
	}

}
