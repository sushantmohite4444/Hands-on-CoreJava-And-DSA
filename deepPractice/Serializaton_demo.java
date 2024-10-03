package deepPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class person1 implements Serializable
{
	public String gender;
	public person1(String gender) {
		this.gender=gender;
	}
	@Override
	public String toString() {
		return gender;
	}
}

public class Serializaton_demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		
		person1 p =new person1("male");
		
//		File f=new File("Person.txt");
//		f.createNewFile();
		
		FileOutputStream fo =new FileOutputStream("Person.txt");
		ObjectOutputStream ob =new ObjectOutputStream(fo);
		ob.writeObject(p);
		ob.close();
		
		FileInputStream fi =new FileInputStream("Person.txt");
		ObjectInputStream oi =new ObjectInputStream(fi);
		
		person1 p1 =(person1) oi.readObject();
		
		System.out.println(p1);
		
		oi.close();
		

	}

}
