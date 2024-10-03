package deepPractice;

final class immutable{     // final can't extend any one this class 
	private int i ;			// private can't access this Variable outside the class	
	
	public immutable(int i) {
		this.i=i;
	}
	
	public immutable  modify(int i) {
		
		
		return (this.i==i)?this:new immutable(i);
	}
	
	
}

// final menace can't reassign  reference related term here we can change content of object

// immutable menace can't change content of object


public class JavaLang_OwnImmutable_cls {
	public static void main(String[] args) {
		
		immutable i= new immutable(10);
		immutable j=new immutable(10);
		immutable k=j.modify(10);
		
		System.out.println(i==j);
		System.out.println(k==j);
				
		
	}

}
