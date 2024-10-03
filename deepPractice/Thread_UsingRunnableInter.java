package deepPractice;


class interfase implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("///////////////////////////////Fist_thread/////////////////////////////////////////////////////////////////");
		for (int i = 0; i < 1000; i++) {
			System.out.println("Fist_Thread");
			
			System.out.print(i);
		}
		
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class Thread_UsingRunnableInter {
	
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		interfase it= new interfase();
		Thread th=new Thread(it);
//		th.set******();th.get*******();
		
		th.start();
		
		Thread.currentThread().setPriority(1);
		for (int i = 0; i < 1000; i++) {
			System.out.println("Main_Thread...............");
			
			System.out.print(i);
		}
		
	}

}
