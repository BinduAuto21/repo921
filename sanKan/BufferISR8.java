package sanKan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferISR8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(ISR);
		
		int a = Integer.parseInt(BR.readLine());
		
		String str = BR.readLine();
		
		System.out.println(a);
		System.out.println(str);

	}

}
