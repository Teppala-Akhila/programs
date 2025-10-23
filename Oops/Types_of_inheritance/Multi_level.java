package inheritance;

class Animal{
	void animal() {
		System.out.println("animal");
	}
}
class Dog extends Animal{
	void dog() {
		System.out.println("dog");
	}
}
class Cat extends Dog {
	void cat() {
		System.out.println("cat");
	}
}
public class Multi_level {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.dog();
		d.animal();
		//d.cat(); -->The method cat() is undefined for the type Dog
		Cat c=new Cat();
		c.cat();
		c.animal();
	}
}

//Multilevel : One class inherits another, and that class is inherited by another class (a chain).
//output:
//	dog
//	animal
//	cat
//	animal

//or

//package inheritance;
//
//class Animal{
//	void animal() {
//		System.out.println("animal");
//	}
//}
//class Dog extends Animal{
//	void dog() {
//		System.out.println("dog");
//	}
//}
//class Cat extends Dog {
//	void cat() {
//		System.out.println("cat");
//	}
//}
//public class Multi_level {
//
//	public static void main(String[] args) {
//		Cat c=new Cat();
//		c.dog();
//		c.animal();
//		c.cat();
//	}
//}

//output:
//	dog
//	animal
//	cat