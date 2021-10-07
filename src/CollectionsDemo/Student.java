package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
public void input()
{
	StudentDemo s1=new StudentDemo(1,"Paola",23);
	StudentDemo s2=new StudentDemo(2,"Yara",23);
	StudentDemo s3=new StudentDemo(3,"Luis",26);
	
	ArrayList<StudentDemo> al=new ArrayList<StudentDemo>();//Generic Array List
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	//Use to Iterate through collection
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		StudentDemo st=(StudentDemo)itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student oo=new Student();
		oo.input();
	}

}
