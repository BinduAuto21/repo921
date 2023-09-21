package sanKan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferFR8 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C://apitestdata//dataTesttext.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
	    //BufferedReader br = new BufferedReader(fr);
	  
	     String str = br.readLine();
	     System.out.println(str);


	}

}
