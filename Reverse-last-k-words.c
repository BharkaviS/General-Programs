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
    for(j=0;j<i-k;j++){
        printf("%s ",a[j]);
    }
    l=i-1;
    while(k--){
        printf("%s ",a[l--]);
    }
}
