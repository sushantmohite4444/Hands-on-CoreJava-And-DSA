package opps;

// overloading =Two methods are said to be overload if and only if both having the same name but different argument types.

//overriding = e. That is method signature must be same. We can't override a static method as non static and vice versa
//method hiding =	both Parent and Child class methods should be static.method resolution is always takes care by 
//compiler based on reference type

class Parent1 {
	public Object methodOne() {
		return "parent";
	}
	
	public static void methodhiding() {
		System.out.println("parent");
		
	}
}

class Child1 extends Parent1 {
	public String methodOne() {
		return "child";
	}
	
	public static void methodhiding() {
		System.out.println("child");
		
	}
}

public class Polymorphism {

	public void methodOne() {
		System.out.println("no-arg method");
	}

	public void methodOne(double d) {
		System.out.println("double-arg method");
	}

	public static void main(String[] args) {

		Polymorphism p = new Polymorphism();
		// automatic promotion in overloading
		p.methodOne(2);
		
		Parent1 parent =new Child1();
		System.out.println(parent.methodOne());
		parent.methodhiding();
		
	}
	
	public static void main(int args) {
		System.out.println("example of method overloading");
	}
	}
	
//	
//By using class name if we are calling a method and that method returns the same class 
//object such type of method is called factory method.


