package opps;


//java won't provide support for multiple inheritance

class Parent {
public void methodOne(){ }
}
class Child extends Parent {
public void methodTwo() { }
}

public class Inheritance_is_a_relationship  {

	public static void main(String[] args) {
		
		Parent p =new Parent();
		
		p.methodOne();
		//p.methodTwo(); error
		
		Parent p1 =new Child();
		p1.methodOne();
		//p1.methodTwo(); error
		
		
		Child c =new Child();
		c.methodOne();
		c.methodTwo();
		//Child c1 =new Parent(); //error
		
	}

}
