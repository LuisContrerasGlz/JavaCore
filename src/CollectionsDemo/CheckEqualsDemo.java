package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("The Array List elements are:");
		for(Integer s:arr)
		{
			System.out.println(s);
		}
		Iterator<Integer> i=arr.iterator();
		Integer str=0;
		while(i.hasNext())
		{
			str=(Integer)i.next();
			if(str.equals(2))
			{
				i.remove();
				System.out.println("2 is removed from list");
				break;
			}
		}
		System.out.println("The Array List elements are:");
		for(Integer s:arr)
		{
			System.out.println(s);
		}
	
	}

}
