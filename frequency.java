import java.util.Scanner;
class frequency
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str;
int i,f=0;
char x;
System.out.println("Enter the String: ");
str=sc.nextLine();
int len=str.length();
System.out.println("Enter the character to search: ");
x=sc.next().charAt(0);
for(i=0;i<len;i++)
{
if(str.charAt(i)==x)
{
f++;
}
}
if(f==0)
{
System.out.println("Character is not in String");
}
else{
System.out.println("String is present and frequency is"+f);
}
}
}