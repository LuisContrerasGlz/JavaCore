package Arrays_StringDemo;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat=new int[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 9 elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				mat[i][j]=s.nextInt();
				
			}
		}
		//Print the values entered in matrix
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		s.close();
	}

}
