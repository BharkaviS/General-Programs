/*
  Maximum count of vowel
    The program return the row with maximum number of vowels.
*/

#include <stdio.h>

int main()
{
    int n ,i,j,curr=0,max=0,ind;
    scanf("%d ",&n);
    char a[n][n];
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%c ",&a[i][j]);
        }
    }
    
    for(i=0;i<n;i++){
        curr =0;
        for(j=0;j<n;j++){
            switch(a[i][j]){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    curr +=1;
                    break;
            }
        }
        if(curr > max){
            max = curr;
            ind = i;
        }
    }
    for(j=0;j<n;j++){
        printf("%c ",a[ind][j]);
    }
    return 0;
}
