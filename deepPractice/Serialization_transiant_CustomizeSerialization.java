package deepPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Personcls implements Serializable
{
	int age ;
	transient String gender;
	
	// Transient stop from serialization
	// customized serialization use to data encryption, decryption and stop lossing data ()
	
	Personcls(int age ,String gender){
		this.age =age;
		this.gender=gender;
	}
	
	private void writeObject(ObjectOutputStream oo) throws IOException {
		
		oo.defaultWriteObject();
		String st =  "Gender"+ this.gender ;
		oo.writeObject(st);
		
		
		
		
	}
	
	private void readObject(ObjectInputStream oi) throws ClassNotFoundException, IOException {
		
		oi.defaultReadObject();
		 String st =(String) oi.readObject();
		  gender= st.substring(6);
		 
	}
	
	@Override
	public String toString() {
		
		return "age="+ age + " ,  Gender="+ gender;
	}
}

public class Serialization_transiant_CustomizeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Personcls p= new Personcls(23, "male");
		
		FileOutputStream fo =new FileOutputStream("CustumizedSerialization.txt");
		FileInputStream fi =new FileInputStream("CustumizedSerialization.txt");
		
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		
		oo.writeObject(p);
		Personcls p1 =(Personcls) oi.readObject();
		System.out.println(p1);
		
		
		
		
		
	}

}
