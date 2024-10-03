package deepPractice;

class First 
{
	 public synchronized void firstclsm(Second s) throws InterruptedException {
		 
		 Thread.sleep(2000);
		 s.method();
	}
	 
	 public synchronized void method(){
		 System.out.println("sushant");
	 }
}

class Second 
{
	 public synchronized void secondclsm(First f) throws InterruptedException {
		
		 Thread.sleep(2000);
		 f.method();
		 
	}
	 public synchronized void method(){
		 System.out.println("sushant");
	 }
}

class ThreadNew extends Thread{
	
	First f ;
	Second s;
	ThreadNew (First f,Second s) throws InterruptedException{
		
		this.f=f;
		this.s=s;
		
		Thread t =new Thread(this);
		t.start();
		f.firstclsm(s);
	}
		@Override
		public void run() {
			try {
				s.secondclsm(f);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

public class Thread_DeadLock {
	public static void main(String[] args) throws InterruptedException {
		First f =new First();
		Second s=new Second();
		
//		new ThreadNew(f,s);
		Integer i = 1;
		Integer j= 1;
		System.out.println(i==j);
		
	
	}

}
