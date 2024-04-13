import java.util.*;
class Fibonacciq{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=0,b=1;
System.out.println("enter the length of seq");
int num=s.nextInt();
int sum=0;
String seq="0 1";
for(int i=1;i<=num;i=i+1){
sum=a+b;
a=b;
b=sum;
seq=seq+" "+sum;
}
System.out.println(seq);
}
}



