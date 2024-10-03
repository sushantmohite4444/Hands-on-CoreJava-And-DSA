package deepPractice;

class firstclass {
	
	public firstclass() {
		System.out.println("first");
	}
	
	
	public static void name() {
		System.out.println("Parentclass");
	}
}


public class Method_Hidding extends firstclass {
	
	Method_Hidding(){
		System.out.println("sushantmohite");
	}
	
	
	public static void name() {
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		
		firstclass fc=new firstclass ();
//		Method_Hidding fd= (Method_Hidding)fc;
		Method_Hidding mh=new Method_Hidding();
//		firstclass fm=new Method_Hidding();
		
//		fc.name();
	}

}
