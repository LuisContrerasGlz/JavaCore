package conditional_Structure;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)//Rows
		{
			for(int j=0;j<i;j++)//Columns
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
//*
//*	*
//*	*	*
//*	*	*	*
//*	*	*	*	*
//i=0(0<5)
//j=0(0<=0)
//*
//j=1(1<=0)
//
//i=1(1<5)
//j=0(0<=1)    j=1(1<=1)  j=2(2<=1)
//**
//i=2(2<5)
//j=0(0<=2)  j=1(1<=2)    j=2(2<=2)   j=3(3<=2)
//***


//			*
//		   **
//		  ***
//		 ****
//		*****