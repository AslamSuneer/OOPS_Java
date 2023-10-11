import java.util.Scanner;
class transpose{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row count: ");
int row=sc.nextInt();
System.out.println("Enter the column count: ");
int col=sc.nextInt();
int a[][]=new int[row][col];
System.out.println("Enter the elements: ");
  for(int i=0;i<row;i++)
	{
	for(int j=0;j<col;j++)
		{
	a[i][j]=sc.nextInt();
		}
	}
System.out.println("elements are: ");
    for(int i=0;i<row;i++)
	    {
		for(int j=0;j<col;j++)
		{
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
//Transpose
System.out.print("Transpose is: \n");
  for(int i=0;i<col;i++)
	{
	for(int j=0;j<row;j++)
		{
		System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
}
}
