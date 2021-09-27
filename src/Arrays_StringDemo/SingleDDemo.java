package Arrays_StringDemo;

import java.util.Scanner;

public class SingleDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Option - 1 int[] marks=new int[5];//Declaring an Array Marks
		/*marks[0]=90;
		marks[1]=38;
		marks[2]=86;
		marks[3]=38;
		marks[4]=90;*/
		
		//Option - 2int[] arr= {12,44,2,45,21,33,5,2};//Declaring and Initializing an array simultaneously
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		int[] marks=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println(marks.length);
		System.out.println("Enter elements");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=s.nextInt();
		}
		//for(int m=0;m<marks.length;m++)
		for(int m:marks)//Enhanced for loop
		{
			System.out.println(m);
		}
		s.close();
	}
	
	
