import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    int n,i,j;
	    int[] a=new int[101];
	    Scanner sc= new Scanner(System.in);
	    n=sc.nextInt();
	    for(i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int mid=n/2;
	    for(i=0,j=n-1;i<=mid && j>=mid;i++,j--){
	        if(i==mid){
	            System.out.print(a[i]+" ");
	        } 
	        else{
	        System.out.print(a[j]+" "+a[i]+" ");
	        }
	            
	        }
	}
}
