import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        //taking input
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int max=-99999;

        //finding the maximum element
        for (int i = 0; i < n; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        int[] b=new int[max+1];
        int[] c=new int[a.length];
        //storing the frequency in a.
        for (int i = 0; i < a.length; i++) {
            b[a[i]]=b[a[i]]+1;
        }
        System.out.println(Arrays.toString(b));
        for (int i = 1; i < b.length; i++) {
            b[i]=b[i-1]+b[i];
        }
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < n; i++) {
            c[b[a[i]]-1]=a[i];
            b[a[i]]=b[a[i]]-1;
        }

        System.out.println(Arrays.toString(c));
    }


}
