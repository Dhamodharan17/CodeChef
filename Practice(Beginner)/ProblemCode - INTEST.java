import java.util.*;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {


Scanner input=new Scanner(System.in);
int n=input.nextInt();
int k=input.nextInt();
int arr[]=new int[n];
int count=0;
for(int i=0;i<n;i++){
    arr[i]=input.nextInt();
    if (arr[i]%k==0)
    {
        count++;
    }
}
System.out.println(count);
		
	}
}
