package FileHandling;

import java.io.*;

public class FileHandlingDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D://Mexico.txt");
		try {
			file.createNewFile();
			file.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
