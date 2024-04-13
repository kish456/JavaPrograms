class Employee
{
private String password;

public void setpassword(String password){
this.password=password;

}
 public String getpassword()
{
return password;
}
}
class pass{
public static void main(String[] args){
Employee obj = new Employee();
obj.setpassword("kishore");
String x=obj.getpassword();
System.out.println(x);
}
}