/*
  Last occuring vowel in each row in given character matrix
    The program returns the last occuring vowel in each row of the given character matrix
    Assuming that all the characters are in lower case
*/

#include<stdio.h>
#include <stdlib.h>

int main()
{
    int r,c,i,j,flag=0;
    scanf("%d %d ",&r,&c);
    char a[r][c],b;
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            scanf("%c ",&a[i][j]);
        }
    }
    for(i=0;i<r;i++){
        flag = 0;
        for(j=0;j<c;j++){
           if(a[i][j]=='a' || a[i][j]=='e'|| a[i][j]=='i' || a[i][j]=='o' || a[i][j]=='u'){
               b =' ';
              
                b = a[i][j];
                flag = 1;
            }
        }
        if(flag == 1){
            printf("%c\n",b);
        }
    }
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
            printf("%c ",a[i][j]);
        }
        printf("\n");
    }


}
