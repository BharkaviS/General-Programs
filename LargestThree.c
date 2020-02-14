#include <stdio.h>
#include<stdlib.h>
int* LargestThree(int a[], int n){
    int i,j,k=0,temp;
    int *b = malloc(4 * sizeof(int));
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    for(i=0;i<3;i++){
        b[k++]=a[i];
    }
    return b;
}
int main(){
    int n,a[101],i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d ",&a[i]);
    }
    int *b=LargestThree(a,n);
    for(i=0;i<3;i++){
        printf("%d ",b[i]);
    }
    return 0;
}
