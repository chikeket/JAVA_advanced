package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FileCopyTest 
{
	@Ignore
	@Test
	@DisplayName("파일복사")
	public void copy() throws IOException {
		FileOutputStream fw = new FileOutputStream("c:/Temp/copy.txt");
		InputStream inputStream = new FileInputStream("c:/Temp/data.txt");
		
		int readByte;
		while((readByte = inputStream.read()) != -1) { //Ctrl + Z
			fw.write(readByte);
		}
		fw.close();
	}

	@Ignore
	@Test
	@DisplayName("Reader 복사")
	public void copy2() throws IOException {
		FileWriter fw = new FileWriter("c:/Temp/copy4.txt"); // 만들어질 파일
		FileReader fr = new FileReader("c:/Temp/data.txt"); //읽어들일 파일
		
		int bytesRead = 0;//읽어들인 값만큼만 출력하기 위해 넣어줌
		char[] readByte = new char[5];
		while((bytesRead = fr.read(readByte)) != -1) { //Ctrl + Z
			fw.write(readByte, 0, bytesRead);//이렇게 안하면 앞에 사용한 값이 같이 들어와서 원하지 않는 값도 같이 들어옴
		}
		fw.close();
		
	}
	
//	@Ignore
//	@Test
//	@DisplayName("버퍼를 통해서 라인입력")
//	public void 버퍼입력() throws IOException {
//		BufferedReader fr = new BufferedReader( new FileReader("src/main/resources/emp.txt") ); //읽어들일 파일
//		String str = null;
//		while((str = fr.readLine())!= null) {
//			System.out.println(str);
//		}
//		fr.close();
//		
//	}
	
	@Test
	@DisplayName("스캐너를 통해서 라인입력")
	public void 스캐너입력() throws IOException {
		Scanner scanner = new Scanner(new File("src/main/resources/emp.txt"));
		String emp = scanner.nextLine();
		//Steven 이름 출력
		
		//split -> String[]
		String[] emplist = emp.split(",");
		System.out.println(emplist[1]);
		System.out.println("그만읽을래");
		scanner.close();
		
	}
}
