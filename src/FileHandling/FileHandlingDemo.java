package FileHandling;

import java.io.*;

public class FileHandlingDemo {

	
	public static void main(String[] args) {
		
		File file=new File("D://Mexico.txt");
		try {
			file.createNewFile();
			file.delete();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
	}

}
