package nidhi;

public class polymorphism2 {
public String name;
public int rollno;

public polymorphism2(String name, int i) {
	super();
	this.name = name;
	this.rollno = i;
}
void print(){
	System.out.println("polymorphism");
}


public String getName() {
	return name;
}
public int getRollno() {
	return rollno;
}

}
