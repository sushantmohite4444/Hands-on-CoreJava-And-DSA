package deepPractice;

class objcectLevelLock {

//	public synchronized void printname(String s)  {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(s);
//		}
//	}
//	

	public static synchronized void printname(String s) {
		for (int i = 0; i < 5; i++) {
			System.out.println(s);
		}
	}
}

class newthread1 extends Thread {

	objcectLevelLock o;
	String s;

	public newthread1(objcectLevelLock o, String s) {
		this.o = o;
		this.s = s;
	}

	@Override
	public void run() {
		o.printname(s);
	}

}

public class Thread_synchronize_Static_sync {

	public static void main(String[] args) {
//		objcectLevelLock o= new objcectLevelLock();       use OBJ LEVEL LOCK synchronize method to avoid data inconsistency problem 
//		newthread1 n = new newthread1(o,"sushant");            for MULTIPLE Thread SINGLE object                 
//		newthread1 n1 = new newthread1(o,"mohite");
//		n.start();
//		n1.start();

		objcectLevelLock o = new objcectLevelLock(); // CLASS LEVEL LOCK Static Synchronize method
		objcectLevelLock o1 = new objcectLevelLock();
		newthread1 n = new newthread1(o, "sushant"); // for MULTIPLE Thread MULTIPLE object
		newthread1 n1 = new newthread1(o1, "mohite");
		n.start();
		n1.start();

	}

}
