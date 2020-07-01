/*
Given N integers, add every two successive elements.Repeat the process until a single sum value is obtained.
If the sum has more than one digits add all the digits until a single digit is obtained.

Input:
5
1 2 3 4 5
Output:
3

Explanation:
1 2 3 4 5
3 5 7 9
8 12 16
20 28
48

4+8 = 12;
1+2 = 3

*/
import java.io.*;
import java.util.*;

class SuccessiveSum{
	public static int func(int n,int[] a){
		int i,lp=0,rp=1,sum=0,k;
		if(n>1){
			for(i=0;i<n-1;i++){
				a[i] = a[lp]+a[rp];
				lp++;
				rp++;
			}
			return func(n-1,a);
		}
			sum = 0;
			k = a[0];
			while(k>0){
				sum += k%10;
				k /=10;
				if(k==0 && sum>9){
					k = sum;
					sum =0;
				}
			}
		return sum;
	}
	public static void main(String args[]){
		int n,i,j,k,amt,sum=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		amt = func(n,a);
			System.out.println(amt);
	}
}
