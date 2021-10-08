package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAllDemo {
	//creating an empty arraylist with initial capacity as 5
	ArrayList<Integer> arr=new ArrayList<Integer>(5);
	ArrayList<Integer> arr1=new ArrayList<Integer>(5);
	public void input()
	{
		//using add to add elements into list
		arr.add(12);
		arr.add(1);
		arr.add(3);
		
		System.out.println("Print list");
		for(Integer num:arr)
		{
			System.out.println("arr1:"+num);
		}
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		
		System.out.println("Print list");
		for(Integer num:arr1)
		{
			System.out.println("arr2:"+num);
		}
		//Inserting all elements of array list2 to array list 1
		arr.addAll(arr1);
		System.out.println("Printing all elements of both arraylist");
		for(Integer num:arr)
		{
			System.out.println("arr:"+num);
		}
		arr.remove(2);
		System.out.println("Printing all elements after removing data from 2nd location");
		for(Integer num:arr)
		{
			System.out.println("arr:"+num);
		}
		System.out.println("Size of an Array List is:"+arr.size());
		//arr.clear();
		//System.out.println("Clear all elements from array:"+arr);
		if(arr1.contains(2))
		{
			System.out.println("Element is present in Array List");
		}
		
		else
		{
			System.out.println("Element is not present in List");
		}
		System.out.println("Does array list contains array list2:"+arr.containsAll(arr1));
		
		System.out.println(arr1.isEmpty());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAllDemo oo=new AddAllDemo();
		oo.input();
	}

}
