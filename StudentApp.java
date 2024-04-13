class StudentApp{
int rollNo;
String branch;
static String name;
public static void main(String[] args)
{
StudentApp obj = new StudentApp();
name = "rahul";
obj.rollNo = 212;
obj.branch = "cse";
System.out.println(obj.rollNo);
System.out.println(obj.branch);
System.out.println(obj.name);
name = "kranti";
obj.rollNo = 213;
obj.branch = "ece";
System.out.println(obj.rollNo);
System.out.println(obj.branch);
System.out.println(obj.name);
name = "badrassi";
obj.rollNo = 214;
obj.branch = "mech";
System.out.println(obj.rollNo);
System.out.println(obj.branch);
System.out.println(obj.name);
name = "ritheesh";
obj.rollNo = 215;
obj.branch = "ece";
System.out.println(obj.rollNo);
System.out.println(obj.branch);
System.out.println(obj.name);

}
}

