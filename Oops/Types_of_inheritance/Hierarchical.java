package inheritance;

class Parent{
	void parent(){
		System.out.println("parent");
	}
}
class Child_1 extends Parent{
	void child_1(){
		System.out.println("child_1");
	}
}
class Child_2 extends Parent{
	void child_2() {
		System.out.println("child_2");
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		Child_1 c1=new Child_1();
		c1.child_1();
		c1.parent();
		
		Child_2 c2=new Child_2();
		c2.child_2();
		c2.parent();
		
	}

}

//output:
//	child_1
//	parent
//	child_2
//	parent
