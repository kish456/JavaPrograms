class A{
int x=20;
void show(){
System.out.println("what is your name");
}
}
class B extends A
{
int x=10;
void B(){
System.out.println("hello");
}
void C()
{
int x =30;
System.out.println(x);
System.out.println("hello");
System.out.println(super.x);
super.show();
}
public static void main(String [] args ){
B obj = new B();
obj.C();
}
}

