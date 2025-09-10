class demo2darray
{
	//this is  Two dimantional array  2d array
	public static void main (String args[])
	{
		int arr[][]={{88,30,67},{20,30,40},{20,44,40}};
		
		
		for(int i=0; i<arr.length; i++)
		{
			
			for(int j=0; j<arr[i].length; j++)
			{
			    System.out.print(arr[i][j]+" ");	//println ln hata diyan fir matrix aa gyaa
			}
			System.out.println();
			
			
		}
	}
}