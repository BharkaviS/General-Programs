/*
Input: 
  23 3 

Output: 
  7 

Explanation: 
  The binary representation of 23 is 10111. 
  The decimal equivalent of last 3 bits is 7 (111)2.

*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,x;
    scanf("%d %d",&n,&x);
    printf("%d",n&((1<<x)-1));


}
