package deepPractice;

import java.util.Arrays;

class deapcloning implements Cloneable{
	int i=0;
	int arr[]= {1,23,45,5};
	
//	@Override             shallow cloning
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	//deap cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		deapcloning d	=(deapcloning) super.clone();
		
		d.arr=new int[this.arr.length];
		for (int i = 0; i < arr.length; i++) {
			d.arr[i]=this.arr[i];
		}
		return d;
	}
}

public class JavaLang_Coneing {
	public static void main(String[] args) throws CloneNotSupportedException {
	
		deapcloning d=new deapcloning();
		deapcloning cd=(deapcloning) d.clone();
		cd.arr[0]=12212;
		System.out.println(Arrays.toString(d.arr));
		System.out.println(Arrays.toString(cd.arr));
		
		
	}

}
