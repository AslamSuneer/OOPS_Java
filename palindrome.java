import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str,rev="";
int i;
System.out.println("Enter String: ");
str=sc.nextLine();
str=str.toLowerCase();
int len=str.length();
for(i=len-1;i>=0;i--)
{
rev+=str.charAt(i);
}
if(str.equals(rev))
{
System.out.println("String is palindrome");
}
else{
System.out.println("String is not palindrome");
}
}
}