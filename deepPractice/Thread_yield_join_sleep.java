package deepPractice;

// yield() to get priority to high priority  thread()
// join() to not getting running state up to other thread() not complete 
//sleep() thread upto 

class yieldc extends Thread{
	
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i +" yield");
		}
	}
}


class Join extends Thread{
	
  static Thread j;
	@Override
	public void run(){
		try {
			j.join();
		} catch (InterruptedException e1) {
		
			e1.printStackTrace();
		}
		for (int i = 0; i <5; i++) {
			
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("Sushant Mohite");
					e.printStackTrace();
				}
			
			System.out.println(i + " join");
		
		}
	}
}
public class Thread_yield_join_sleep {
	
	public static void main(String[] args) throws InterruptedException {
		

//		yieldc y =new yieldc();
//			y.start();
//			y.setPriority(10);   //yield get higher priority
//		 Thread.yield();		//main thread always stop for higher priority thread 
		
	
		Join.j = Thread.currentThread();
		Join j =new Join();
		j.start();
		
		
		//or
		
//		j.interrupt();
//     	j.join();
     	
		
		for (int i = 0; i < 5; i++) {
			Thread.currentThread().sleep(2000);
			System.out.println(i+ " main");
		}
	}

}
