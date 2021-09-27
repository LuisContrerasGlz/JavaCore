package Arrays_StringDemo;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20,10,5,3,2};//Declare Array
		int n=arr.length;//n=5
		int temp=0;
		for(int i=0;i<n;i++)//i=0(0<5)
		{
			for(int j=1;j<n-i;j++)//j=1(1<5)
			{
				if(arr[j-1]>arr[j])//arr[0]>arr[1]
				{
					//swap data
					temp=arr[j-1];//
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int m: arr)
		{
			System.out.println(m);
		}
	}

}
