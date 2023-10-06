 //formula : prefixSum[i]=prefixSum[i-1]+arr[i];
// [ used to find sum of elements between given 2 index]
import java.util.*;
public class PrefixSum {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[100];
      int n=sc.nextInt();
      
      for(int i=1;i<=n;i++){
          arr[i]=sc.nextInt();
      }
      
      int prefixSum[]=new int[100];
      prefixSum[0]=0;
      
      for(int i=1;i<=n;i++){
          prefixSum[i]=prefixSum[i-1]+arr[i];
      }
      
      int x=sc.nextInt();
      int y=sc.nextInt();
      
      int val=prefixSum[y]-prefixSum[x-1];
      System.out.println(val);
    }
}
