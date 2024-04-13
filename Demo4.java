class Demo4{
public static void main(Strin g[] args ){
Thread t=Thread.currentThread();
System.out.println(t.getName());
System.out.println(t.getPriority());
t.setName("demo");
t.setPriority(Thread.MAX_PRIORITY); 
System.out.println(t.getName());
System.out.println(t.getPriority());
}
}

