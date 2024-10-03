package deepPractice;

import java.lang.reflect.Method;
import java.util.Iterator;

import deepPractice.Method_Hidding;

class synccls{
	
	public synchronized static void method(String s)  {
		
		for(int i=0;i<3;i++) {
//			System.out.println(s);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}

class threadcls extends  Thread {
	
	synccls snc;
	String s;
	
	static Thread mainth;
	
		public threadcls(synccls snc,String s) {
		
			this.snc= snc;
			this.s =s;			
		}
		
		@Override
		public void run() {
			
//			try {
//				mainth.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block              join (child wait until main complete)
//				e.printStackTrace();
//			}
			snc.method(s);
			
//			synchronized (this) {
//			snc.method(s);
//				this.notify();
//			}
//			
			
		}
}

public class Thread_ClassLock {

	public static void main(String[] args) throws InterruptedException {
		
		synccls obj =new synccls();
		synccls obj1 =new synccls();
		
		
		
		threadcls t1 =new threadcls(obj,"sush");
//		threadcls.mainth = Thread.currentThread();  join
		threadcls t2 =new threadcls(obj1,"mohite");
		
		
		t1.start();
		t2.start();
		t1.join();     //main wait until child complete
		t2.join();
		
		
		for( int i=0;i<30;i++ ) {
		System.out.println(Thread.currentThread().getName());
	}
		
		
		
//		synchronized(t1) {
//			t1.wait();
//		for( int i=0;i<30;i++ ) {
//			System.out.println(Thread.currentThread().getName());
//		}
//		}
		
		
		
	}
}
	
	
