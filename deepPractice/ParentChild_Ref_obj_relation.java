package deepPractice;

class parent{
	public void parentmethod() {
		System.out.println("Inside parentmethod");
	}
}

class child extends parent{
	public void childmethod() {
		System.out.println("Inside childmethod");
	}
	
	
}



public class ParentChild_Ref_obj_relation {
	public static void main(String[] args) {
		
		parent p =new parent();
		p.parentmethod(); 
//		p.childmethod();  error
		
		parent p1=new child();
		p.parentmethod();
//		p.childmethod(); error
		
		child c=new child();
		c.parentmethod();
		c.childmethod();
		
//		child c1 =new parent();   error due to child reference to parent object not possible
		
		
	}

}
