import java.io.*;
class hand{
public static void main(String args[]){

try{
FileInputStream fin=new FileInputStream("Testing.txt");

FileOutputStream fout=new FileOutputStream("copying.txt");
int i;
while((i=fin.read())!=-1){
fout.write(i);
}
fin.close();
fout.close();
}
catch(FileNotFoundException e){
System.out.println(e.getMessage());
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
}