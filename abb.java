abstract class A{
static void abc()
{
System.out.println("hello Ritheesh kumar");
}
abstract void bcd();
}
abstract class B extends A
{
abstract void bcd();
static void abc()
{
System.out.println("Kishore kumar");
}
}
class C extends B
{
void bcd()
{
System.out.println("styler");
}
public static void main(String [] args){
C obj=new C();
obj.abc();
}
}
