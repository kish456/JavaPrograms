import java.util.*;
class stack1{
public static void main(String[] args){
Stack s=new Stack();
s.push(5);
s.push("rp");
s.push("kishore");

System.out.println(s);
System.out.println(s.peek());
System.out.println(s.empty());
Enumeration e=s.elements();
while(e.hasMoreElements())
{
System.out.println(e.nextElement());

}
}
}
      
 
