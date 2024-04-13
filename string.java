import java.io.*;
public class string
{
public static void main(String[] args)
{
try(FileInputStream fout=new FileInput  Stream("C:\\stream\\iostream"))
{
String msg = "welcome to java";

byte byteArray[]=msg.getBytes();
fout.write(byteArray);
}
catch(Exception e)
{
System.out.println(e);
}
}
}

