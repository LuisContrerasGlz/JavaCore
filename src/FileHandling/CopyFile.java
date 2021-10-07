package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		File file=new File("D://Sampada_Resume.pdf");
		File opfile=new File("D://Sampada_Resume_copy.pdf");
		
		FileInputStream fileinputstream=null;
		FileOutputStream fileoutputstream=null;
		
		try
		{
			fileinputstream=new FileInputStream(file);
			fileoutputstream=new FileOutputStream(opfile);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			System.out.println(fileinputstream.available());
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try
		{
			while((i=fileinputstream.read())!=-1)
			{
				fileoutputstream.write(i);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			//close the Stream
			if(fileinputstream!=null)
			{
				try
				{
					fileinputstream.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
			if(fileoutputstream!=null)
			{
				try
				{
					fileoutputstream.close();
				}
				catch (IOException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
			}
		}
	}

}
