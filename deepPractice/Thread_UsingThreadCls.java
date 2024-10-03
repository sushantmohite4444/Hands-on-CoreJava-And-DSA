package deepPractice;


class Fist_thread extends Thread{
	
//	@Override
//	public synchronized void start() {
//		 
//		
//		System.out.println("start");
//		super.start();
//	}
	// Don't override start() method . if override start() then call thread class start() method  using supper.start()

	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Fist_Thread");
			
			System.out.print(i);
		}
		
	}
}

public class Thread_UsingThreadCls {
	public static void main(String[] args) {
		
		Fist_thread th =new Fist_thread();
		th.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("main");
			System.out.print(i);
		}
		
		
	}

}
