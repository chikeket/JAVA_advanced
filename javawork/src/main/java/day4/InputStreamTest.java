package day4;

import java.io.IOException;
import java.io.FileOutputStream;

public class InputStreamTest {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fw = new FileOutputStream("c:/Temp/data.txt");
		
		int readByte;
		while((readByte = System.in.read()) != -1) { //Ctrl + Z
			fw.write(readByte);
		}
		fw.close();
	}
}
