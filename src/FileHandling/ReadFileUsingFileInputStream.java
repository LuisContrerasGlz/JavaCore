package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="D://Pankaj.txt";
		int c=0;
	//	try
		//{
			File file=new File(path);
			FileInputStream fip=new FileInputStream(file);
			System.out.println("Contents of file is:");
			while((c=fip.read())!=-1)
			{
				System.out.print((char)c);
			}
		//}
//		catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
	}

}
