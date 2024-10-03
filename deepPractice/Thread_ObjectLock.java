package deepPractice;


class syncmehodcls{

	public synchronized void method1(String name) {
		for(int i=0;i<20;i++) {
          System.out.println(name);
			
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class FirstThred  extends Thread{
	syncmehodcls scl;
	String s;     // s is not a static
	FirstThred(String s, syncmehodcls sf){
	this.scl =	sf;
	this.s =s;
	}
	
	@Override
	public void run() {

		scl.method1(s);
		
	}
}

public class Thread_ObjectLock {

	public static void main(String[] args) {
		syncmehodcls c =new  syncmehodcls();
		
		FirstThred f1 = new FirstThred("sush", c);

		FirstThred f2 = new FirstThred("Mohite", c);

		f1.start();
		f2.start();
		
	}
}


