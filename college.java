import java.util.*;  
class College{
public static void main(String[] args ){
Scanner s=new Scanner(System.in);
System.out.println("enter the number of students");
int students=s.nextInt();
String collegeName="spec";
double percent;
for(int i=1;i<=students;i++){
System.out.println("enter the student name");
String name=s.next();
System.out.println("enter the rollno of student");
int rollno=s.nextInt();
System.out.println("enter the branch of student");
String branch=s.next();
if(branch.equals("ECE"))
{
System.out.println("enter the marks of edc");
int edc=s.nextInt();
System.out.println("enter the marks of ssp");
int ssp=s.nextInt();
System.out.println("enter the marks of cn");
int cn=s.nextInt();
percent=(double)(edc+ssp+cn)/300*100;
System.out.println(name);
System.out.println(rollno);
System.out.println(branch);
System.out.println(percent);
}
else if (branch.equals("CSE"))
{
System.out.println("enter the marks of c");
int c=s.nextInt();
System.out.println("enter the marks of java");
int java=s.nextInt();
System.out.println("enter the marks of python");
int python=s.nextInt();
percent=(double)(c+java+python)/300*100;
System.out.println(name);
System.out.println(rollno);
System.out.println(branch);
System.out.println(percent);
}
else
{

System.out.println(name);
System.out.println(rollno);
System.out.println(branch);
System.out.println("enter valid branch");
}
}
}
}




