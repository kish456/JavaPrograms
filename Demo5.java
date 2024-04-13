class A extends Thread{
public void run(){
System.out.println("hello");
}
public static void main(String[] args){
A obj= new A();
obj.start();
}
}

 