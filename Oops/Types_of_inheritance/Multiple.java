//package inheritance;
//
//interface Civil_eng{
//	void civil_eng();
//}
//interface Builder{
//	void builder();
////	void puppy() {
////		//error:Abstract methods do not specify a body
////	}
//}
//class Worker implements Civil_eng,Builder{
//	public void civil_eng() {
//		System.out.println("animal");
//	}
//	public void builder() {
//		System.out.println("puppy");
//	}
//}
//
//public class Multiple {
//	public static void main(String[] args) {
//		Worker d=new Worker();
//		d.civil_eng();
//		d.builder();
//	}
//}


//Multiple inheritance is a type of inheritance in which a single class inherits from more than one parent class.
//output:
//	animal
//	puppy



package inheritance;

interface A{
	void a();
}

interface B{
	void b();
}
class C implements A,B{
	public void a() {
		System.out.println("A");
	}
	public void b() {
		System.out.println("B");
	}
}
public class Multiple{
		public static void main(String[] args) {
			C c=new C();
			c.a();
			c.b();
	}
	
}






