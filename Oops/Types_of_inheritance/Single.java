package inheritance;

class Teacher{
	void show() {
		System.out.println("hi");
	}
}
class Student extends Teacher{
	void display() {
		System.out.println("hello");
	}
}
public class Single {
	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		s.display();

	}

}
