package deepPractice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_FileWriter_FileReader {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw =new FileWriter("ABC.txt",false);
		fw.write("my name is sushant mohite");
		fw.write("\n");
		fw.write(97);
		fw.write("\n");
		char[] ch= {'b','c','d'};
		fw.write(ch);
		
		fw.flush();
		fw.close();
		
		File f =new File("ABC.txt");
		FileReader fr =new FileReader("ABC.txt");
//		int i =fr.read();
//		
//		while(i!=-1) {
//			
//			System.out.print((char)i);
//			i =fr.read();
//		}
		
		char ch1[]= new char[(int) f.length()];
		fr.read(ch1);
		
		for (char c : ch1) {
			System.out.print(c);
		}
		fr.close();
	
		
		
		
		

	}

}
