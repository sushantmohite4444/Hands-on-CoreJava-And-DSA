package practiceDsa;

public class Dais_problem {
	
	public static void main(String[] args) {
		call( 4);
	}
	
public static void call(int target ) {
	
	if(target == 0) {
		
		return;
	}
	
	for (int i = 1; i <=target; i++) {
		call( target-i);
		
	}
		
	}

}
