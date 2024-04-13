import java.util.*;
public class Sum_Numbers {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in) ;
        System.out.println("Enter the length of sequence");
        int num=s.nextInt();
	int a=0,b=1,k=0;
	String fseq="0 1";
	for(int i=1;i<=num;i++)
	{
		k=a+b;
		
		a=b;
		b=k;
                fseq=fseq+" "+k;
		
	}
		
        System.out.println(fseq);
		
		
	
	}

}
