package deepPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_BufferWriter_Reader {

	public static void main(String[] args) throws IOException {

		BufferedWriter br = new BufferedWriter(new FileWriter("opq.txt"));
		
		br.write("All method same as fileWriter only new line method is add ");
		br.newLine();
		br.write("most used classes is BufferReader and PrintWriter");
		br.flush();
		br.close();
		
		BufferedReader b1=new BufferedReader( new FileReader("opq.txt"));
		    String st =   b1.readLine();
		    
		    while(st!=null) {
		    	System.out.println(st);
		    	st=b1.readLine();
		    }
		
		b1.close();

	}

}
