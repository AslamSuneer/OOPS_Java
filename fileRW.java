import java.io.*;
class fileRW{
public static void main(String args[]){
try{
FileReader fr=new FileReader("Testing.txt");
FileWriter fw=new FileWriter("copy.txt");
BufferedReader br=new BufferedReader(fr);
String str;
while((str=br.readLine())!=null){
System.out.println(str);
fw.write(str);

}
fr.close();
fw.close();
}
catch(IOException e){
System.out.println(e.getMessage());
}
}
}