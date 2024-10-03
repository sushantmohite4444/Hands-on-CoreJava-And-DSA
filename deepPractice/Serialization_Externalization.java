package deepPractice;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Tiger implements Externalizable
{
	

	String Style;
	int age;
	String skill;
	


	public Tiger(){}
	
	
	public Tiger(String style, int age, String skill) {
		this.Style = style;
		this.age = age;
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Tiger [Style=" + Style + ", age=" + age + ", skill=" + skill + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(Style);
		out.writeInt(age);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		Style = (String) in.readObject();
		age =(int) in.readInt();
		
	}
	
}


public class Serialization_Externalization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Tiger t =new Tiger("walk Slow", 21, "Disipline");
		
		FileOutputStream fo =new FileOutputStream("Externalization.txt");
		FileInputStream fi =new FileInputStream("Externalization.txt");
		
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		
		oo.writeObject(t);
		
		Tiger t1 = (Tiger) oi.readObject();
		
		System.out.println(t1);
		
//		private static final long serialVersionUID=1L;
		
//		1. After Serializing object if we change the .class file then we can't perform 
//		deserialization because of mismatch in serialVersionUID of local class and 
//		serialized object in this case at the time of Deserialization we will get 
//		RuntimeException saying in "InvalidClassException".
		
//		2. Both sender and receiver should use the same version of JVM if there any 
//		incompatability in JVM versions then receive anable to deserializable because of 
//		different serialVersionUID , in this case receiver will get RuntimeException 
//		saying "InvalidClassException" .
		
//		3. To generate serialVersionUID internally JVM will use complexAlgorithm which 
//		may create performence problems.
	}

}
