
import java.io.*;
 class Student implements Serializable{
int id;
String name;
public Student(int id,String name){
this.id = id;
this.name= name;
}
}
class Persist{
public static void main(String[] args){
try{
Student S1=new Student(438,"kishore");
FileOutputStream fout= new FileOutputStream("C:\\stream\\iostream");
ObjectOutputStream out = new ObjectOutputStream(fout);
out.writeObject(S1);
out.flush();
out.close();
System.out.println("success");
}
catch(Exception e){
System.out.println(e);
}
}
}

