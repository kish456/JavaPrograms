interface Kishore
{
public void draw();
}
public class InterfaceExample{
public static void main(String[] args) {
int a=10;
Kishore kk=new Kishore(){
public void draw(){
System.out.println("kishore"+a);
}
};
kk.draw();
}

}
