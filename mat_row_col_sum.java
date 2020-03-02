int main()
{
    int n,i,j,rsum=0,csum=0,c=0,k,l;
    int a[101][101];
    
    scanf("%d",&n);
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    
    while(n>0){
        csum=0;rsum=0;
        for(i=0;i<n;i++){
            csum=csum+a[i][k];
        }
        k++;
        for(j=0;j<n;j++){
            rsum=rsum+a[l][j];
        }
        l++;
        printf("%d %d %d %d\n",csum,rsum,l,k);
        if(csum==rsum){
            c++;
        }
        n--;
    }
    printf("%d",c);

    return 0;
}
