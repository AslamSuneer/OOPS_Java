import java.util.Scanner;
class mult
{
int a[][]=new int[10] [10];
int b[][]=new int[10] [10];
int c[][]=new int[10] [10];
int m,n,p,q,i,j,k;
void multiply ()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the rows and columns of first matrix");
m=sc.nextInt(); 
n=sc.nextInt();
System.out.println("Enter elements of matrix1: ");
for (i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter Rows and columns of second Matrix");
p=sc.nextInt();
q=sc.nextInt();
System.out.println("Enter elements of Matrix2: "); 
for (i=0;i<p;i++)
{
for (j=0;j<q;j++)
{
b[i][j]=sc.nextInt(); 
}
}
if (n==p)
{
for (i=0;i<m; i++)
{
for(j=0;j<q;j++)
{
for (k=0;k<n; k++)
{
c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
}
}
}
System.out.println("Multiplied Matrix: ");
 for (i=0;i<p;i++)
{
for(j=0;j<q;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.print ("\n");
}
}
else
{
System .out.println("Can't multipy ");
}
}
}
class matrix
{
public static void main(String args[])
{
mult obj=new mult();
 obj.multiply(); 
} }