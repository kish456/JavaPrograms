class vikas {
int a=10;
static int b=20;
  public static void main(String[] args){
vikas obj= new vikas();
obj.a=30;
System.out.println(obj.a);
System.out.println(new vikas().a);
new vikas().a=40;
System.out.println(new vikas().a);
}
}
