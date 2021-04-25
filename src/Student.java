
public class Student {
private int rollno;
private String name;
private float result;
private Address address;
public Student(int rollno, String name, float result, Address address) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.result = result;
	this.address = address;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", result=" + result + ", address=" + address + "]";
}

}
