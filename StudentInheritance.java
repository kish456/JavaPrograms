class Student{

int Rollno;
String name;
String address;

void display()
{
   System.out.println(Rollno+" "+name+" "+address);

}

}
class Student1 extends Student{
String Email;
int PhoneNo;

void show()
{

   System.out.println(Email+" "+PhoneNo);

}

public static void main(String[] args){
Student1 obj=new Student1();
obj.Rollno=438;
obj.name="kishore";
obj.address="maisammguda";
obj.Email="kishoregavara50@gmail.com";
obj.PhoneNo=143;

obj.display();
obj.show();

}
}
