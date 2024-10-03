package deepPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class FileHandling_BufferReader_PrintWriter {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw =new PrintWriter("pwfile.txt");
		
		pw.println("PrintWriter use for all type data save");
		pw.write("Using write() method we can add only char (97=a)");
		pw.write(97);
		pw.println();
		pw.write("Using print() method we can add any type of data  (97=97)");
		pw.println(97);
		pw.print("float value = " +12.2);
		pw.flush();
		
		BufferedReader bf =new BufferedReader(new FileReader("pwfile.txt"));
		
		String st =bf.readLine();
		
		while(st !=null) {
			System.out.println(st);
			st= bf.readLine();
		}
		

	}

}
