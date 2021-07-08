package nidhi;

public class polymorphism1 {

	

	public static void main(String[] args) {
		
polymorphism2 p=new polymorphism2("nidhi",1);
System.out.println(p.getName());
System.out.println(p.getRollno());
p.print();
polymorphism3 p1=new polymorphism3("nirav", 2);
System.out.println(p1.getName());
System.out.println(p1.getRollno());	
p1.print();
polymorphism2 p2=new polymorphism3("nilay",3);
System.out.println(p2.getName());
System.out.println(p2.getRollno());	
p2.print();
polymorphism2 p3=new polymorphism4("vijay",4);
System.out.println(p3.getName());
System.out.println(p3.getRollno());	
p3.print();
	}

}
