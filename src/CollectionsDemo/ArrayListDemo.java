package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	List<Object> al=new ArrayList<Object>();//Generic
public void input()
{
	al.add("E0111");
	al.add("Jose");
	al.add(2163826);
	al.add("Jose");
	
	al.forEach((n) -> System.out.println(n));

	System.out.println(al);
	System.out.println("Size is:"+al.size());
	System.out.println(al.get(1));
	System.out.println(al.remove(1));
	System.out.println(al);
	System.out.println("------------------");
//	for(Object o:al)
//	{
//		System.out.println(o);
//	}
	
	Iterator<Object> it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		if(al.equals("E0111"))
		{
			it.remove();
			System.out.println("The element e0111 is removed");
			
		}
		
		
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo oo=new ArrayListDemo();
		oo.input();
	}

}
