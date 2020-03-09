#include <stdio.h>

int getremain(int arr[],int n){
    int i,os=0,es=0,res;
    for(i=0;i<n;i++){
        if(arr[i]%2!=0){
            os+=arr[i];
        }
        else{
            es+=arr[i];
        }
    }
    res=os%es;
    return res;
}
int main()
{
   int n,arr[101],i;
   scanf("%d",&n);
   for(i=0;i<n;i++){
       scanf("%d",&arr[i]);
   }
   printf("%d",getremain(arr,n));
    return 0;
}
