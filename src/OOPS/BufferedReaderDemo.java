package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	String name;
	int regid;
	long contactNo;
	public void input() throws IOException {
		InputStreamReader rd=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(rd);
		System.out.println("Enter Name");
		name=bf.readLine();
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				BufferedReaderDemo oo=new BufferedReaderDemo();
				oo.input();
	}

}
