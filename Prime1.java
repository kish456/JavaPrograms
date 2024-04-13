import java.util.*;
class PrimeNumber{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter any num");
int num=s.nextInt();
int sum=0;
for(inti=2;i<num;i=i+1){
if(num%i==0){
sum=sum+1;
}
}
if(sum==0){
System.out.println(num+"is a prime number");
}
else{

System.out.println(num+"is not  a prime number");
}
}
}
