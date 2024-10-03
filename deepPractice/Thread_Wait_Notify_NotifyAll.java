package deepPractice;

// wait,notify,notifyall use for inner thread communication

class NewThread extends Thread{
	
	@Override
	public void run() {
		synchronized(this) {
			
			for (int i = 0; i < 5; i++) {
				try {
					this.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+ "this");
			}
			this.notify();
		}
		
	}
}

public class Thread_Wait_Notify_NotifyAll {
	public static void main(String[] args) throws InterruptedException {
		
	  NewThread nt = new NewThread ();
	      nt.start();
	     
	      System.out.println(Thread.currentThread().getName());
	      
	      // if thread run nt tread then synchronized block in lock 
	      synchronized (nt) {
			
	    	  System.out.println(Thread.currentThread().getName());
	    	  for (int i = 0; i < 5; i++) {
	    		  Thread.currentThread().sleep(1000);
	  			System.out.println(i + "Befor");
	  		}
	    	  
	    	  nt.wait();  // wait() method put main Thread in waiting state up to completion of nt---> thread completion 
	    	  
	    	  for (int i = 0; i < 5; i++) {
	  			System.out.println(i + "After");
	      }
	    	  
	      }
	}

}
