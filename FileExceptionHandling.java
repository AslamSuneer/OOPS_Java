import java.io.*;
class Filecopy
{ 
public static void main(String a[]) throws IOException
{
FileInputStream f1=null;
FileOutputStream f2=null;
try
{
f1= new FileInputStream("test1.txt");
f2= new FileOutputStream("cp.txt");
int c;
do
{
c=f1.read();
if(c!=-1){
f2.write((char) c);
System.out.print((char) c);
}
}while(c!= -1);
}
catch (FileNotFoundException e)
{ System.out.println("File not found"); 
 return; }
f1.close();
f2.close();
}
}
