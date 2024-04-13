abstract class A
{
abstract void show();
void print()
{
System.out.println("print() method");
}
}
class B extends A{
    void show(){
System.out.println("welcome");
}
void display()
{
System.out.println("print() method");
}
public static void main(String[] args){
{
B obj = new B();
obj.show();
obj.display();
obj.print();
}
}
}

