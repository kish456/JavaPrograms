class Student{
int rollno;
String name;
String city;
Student(int rollno,String name,String city){
this.rollno = rollno;
this.name= name;
this.city=city;
}
public String toString()
{
return this.rollno+" "+this.name+" "+this.city;
}
public static void main(String[] args){
Student s1=new Student(101,"raj","lucknow");
Student s2=new Student(102,"mahesh","huderabad");
System.out.println(s1);
System.out.println(s2);
}
}
