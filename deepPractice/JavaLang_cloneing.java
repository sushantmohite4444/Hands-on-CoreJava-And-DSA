package deepPractice;


class Abc implements Cloneable{
	
	int i =10 ;
	Ab  ab;
	Abc (Ab ab){
		this.ab =ab;
	}
	
	                                                      //deep cloning
	
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		
//		Ab ab =new Ab();
//		Abc abc =new Abc(ab);
//		
//		return abc;
//	}
	
                                                        //	shallow cloning 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

class Ab {
	int j=9;
	
}
public class JavaLang_cloneing {
	public static void main(String[] args) throws CloneNotSupportedException {
		Ab ab =new Ab();
		Abc abc = new Abc(ab);
		
		Abc abc1 = (Abc)abc.clone();
		
		abc1.i=100;
		abc1.ab.j=200;
		System.out.println(abc.i + " "+ abc.ab.j );
		System.out.println(abc1.i + " "+ abc1.ab.j );
		
	}

}
