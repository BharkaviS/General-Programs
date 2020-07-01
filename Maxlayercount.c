#include <stdio.h>

int main()
{
    int n,i,j,k,l,a[101][101],sum=0,b,max=-100;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    k=0;
    l=n-1;
    for(b=0;b<n/2;b++){
        sum=0;
    for(i=k;i<=l;i++){
        sum=sum+a[i][k]+a[i][l];
    }
    for(j=k+1;j<=l-1;j++){
        sum=sum+a[k][j]+a[l][j];
    }
    if(sum>max){
        max=sum;
    }
    k++;
    l--;
    }
    if(n%2!=0 &&(a[n/2][n/2]>max)){
        max=a[n/2][n/2];
    }
    printf("%d",max);
    return 0;
}
