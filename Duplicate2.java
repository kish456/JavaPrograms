class Duplicate{
public static void main(String[] args){
int arr[]={1,2,3,4,5,6,5,7,1,2,3,4};
for(int i=1;i<arr.length;i++){
for(int j=1;j<i;j++){
if(arr[i]==arr[j]){
System.out.println(arr[j]);
}
}
}
}
}

