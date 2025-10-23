package inheritance;

interface First{
	void first();
}

interface Second extends First{
	void second();
}

class Third{
	void third() {
		System.out.println("third");
	}
}

class Fourth extends Third implements Second{
	public void first() {
		System.out.println("first");
	}
	public void second() {
		System.out.println("second");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		Fourth ob=new Fourth();
		ob.first();
		ob.second();
		ob.third();
	}
}

//output:
//	first
//	second
//	third


//or

//package inheritance;

//interface First {
//    void first();
//}
//
//interface Second extends First {
//    void second();
//}
//
//class Third implements Second {
//    public void first() {
//        System.out.println("first");
//    }
//    public void second() {
//        System.out.println("second");
//    }
//    void third() {
//        System.out.println("third");
//    }
//}
//
//public class Hybrid { 
//	public static void main(String[] args) { 
//		Third ob = new Third(); 
//		ob.first(); 
//		ob.second(); 
//		ob.third(); 
//		} 
//	}

//output:
//	first
//	second
//	third