 import java.io.FileInputStream;
 import java.io. FileOutputStream;
 import java. io. IOException;
 Public class file handling {

Public static void main(String[] args) 
{ 
Sting Inputfile= "/home/oem/aslam/input/";
Sting output file= "/home/oem/aslam / output";
ReadFileAndWriteToFile(inputFile,
outputFile);
System.out.println("File Handling completed");
}
private static void ReadFileAndWriteToFile(String inputFile, Stung outputFile)
try (
FileInputStream inputStream = new FileInputStream (inputfile);
FileOutputStream outputStream = new FileOutputStream (output file);)

{
int byte Data;
while ((byte Data = inputStream.read()) != -1) {
outputStream.write (byte Data);
}
System out println ("file read and write successful"); }

Catch(IOException e){

System.out.println("Error: "+e getMessage()); 
}
}
