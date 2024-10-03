package deepPractice;

public  class Singletonecls {
	private static Singletonecls obj;
	
	private Singletonecls() {
		
	}
	
	public static Singletonecls getobject() {
		if(obj==null) {
			obj =new Singletonecls();
			
		}
		return obj;
		
	}

	
	public static void main(String[] args) {
		
		Singletonecls obj1 = Singletonecls.getobject();
		Singletonecls obj2 = Singletonecls.getobject();
		
		System.out.println(obj1);
		System.out.println(obj2);
	
		
		
	}

}
