import java.util.*;
public class Prime {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in) ;
        System.out.println("enter any number");
        int num=s.nextInt();
        int fact=0;
        for (int i=1;i<=num;i++)
{
if(num%i==0){
fact=fact+1;

}
}
if(fact==2)
{
System.out.println("it is prime number");
}
else
{
System.out.println("it is not prime");
}
}
}