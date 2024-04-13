class A{
int x=10;
void show(){
System.out.println("Botsa dileep");
}
}
class B extends A{
int x=20;
B()
{
}
void print()
{
int x=30;
System.out.println(x);
System.out.println(this.x);
System.out.println(super.x);
}
public static void main(String[] args){
B obj=new B();
obj.print();
obj.show();
}
}


