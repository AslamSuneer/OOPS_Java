import java.util.Scanner;
class palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str;
System.out.println("Enter the string: ");
str=sc.nextLine();
str=str.toLowerCase();
int flag=0; //palindrome
int len=str.length();
for(int i=0;i<=len/2;i++){
if(str.charAt(i)!=str.charAt(len-1-i)){
flag=1;	//not palindrome
break;
}
}
if(flag==0)
System.out.println(str+" is palindrome");
else
System.out.println(str+" is not palindrome");
}}