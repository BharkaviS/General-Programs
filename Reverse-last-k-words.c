#include<stdio.h>
#include <stdlib.h>

int main()
{
    char a[51][101];
    int k,i=0,j=0,l;
    scanf("%d ",&k);
    while(scanf("%s ",a[i])==1){
        i++;
    }
    if(i!=k){
    for(j=0;j<k;j++){
        printf("%s ",a[j]);
    }
    i=i-1;
    while(i>=k){
        printf("%s ",a[i]);
        i--;
    }
    }
    else{
        while(i--){
            printf("%s ",a[i]);
            
        }
    }
}
