/*
Problem Statement:

Raju and Kumar are friends and they order S items in a hotel but Kumar does not eat the Ith item ordered. 
Raju eats the Ith item alone. They decide to share the cost of all items they share and eat. 
The amount paid by Kumar is also passed as the input. 
If the bill amount is split equally after deducting the Ith item price the program must print "FAIR SHARE" 
otherwise the program must print the absolute difference between amount paid by Kumar and the half of the amount for the items shared by Raju and Kumar.

Input Format:

First line contains S & I [S - Number of Items & I - the item ate by Raju alone].
Second line contains items cost separated by space.
Third line contains the amount paid by Kumar

Output Format:

First Line contains "FAIR SHARE" or the absolute difference between the amount paid by Kumar and the half of the amount for the items shared by Raju and Kumar rounded up to 1 decimal place.
Input:
7 4
12 3 7 34 12 4 8
30
Output:
7.0

Example Input/Output 2:

Input:
5 3
40 20 11 6 8
37
Output:
FAIR SHARE

Example Input/Output 3:

Input:
4 4
15 10 20 25
25
Output:
2.5
*/
import java.io.*;
import java.util.*;

class FoodAvg{
	public static void main(String args[]){
		int n,i,j,k,amt,sum=0;
		float diff,avg;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		int[] a = new int[n];
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
			if(i!=k-1){
				sum += a[i];
			}
		}
		amt = sc.nextInt();
		avg = (float)sum/2;
		if(amt == avg){
			System.out.println("FAIR SHARE");
		}
		else{
			diff = Math.abs(amt- avg); 
			System.out.println(diff);
		}
	}
}
