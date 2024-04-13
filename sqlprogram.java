import java.sql.*;
import com.mysql.cj.jdbc.Driver;
class main{
public static void main(String[] args){
String url="jdbc:mysql://localhost:3306/peters";
String uname="root";
String pwd="kissy@987";
try{
Driver d = new Driver();
DriverManager.registerDriver(d);
Connection c=DriverManager.getConnection(url,uname,pwd);
Statement s=c.createStatement();
ResultSet rs=s.executeQuery("select * from student");
while(rs.next()){
int id=rs.getInt("stud_id");
String name=rs.getString("stud_name");
int marks=rs.getInt("marks");
String skills=rs.getString("skills");

System.out.println(id +" "+name+" "+marks+" "+skills);

}
rs.close();
s.close();
c.close();
}
catch(Exception e){
System.out.println("completed");
}
}
}