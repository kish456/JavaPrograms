class A{
  static void  bdc(){
System.out.println("hello");

}
}
class B extends A
{
  void abc()
{
System.out.println("welcome");
}

public static void main(String[] args){
 A obj=new A();
obj.bdc();

}
}