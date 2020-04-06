#include <stdio.h>
#include<string.h>

int main()
{
    int n,i,c,k=1;
    char a[101];
    scanf("%s",a);
    n=strlen(a);
    c=n-1;
    for(i=n-1;i>=0;i--){
        if(c>=0){
        k++;
        printf("%c",a[c]);
        c-=k;
        }
    }
}
