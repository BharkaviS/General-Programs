'''
Input:
1 2 3 4 5 6 7

Output:
7 1 6 2 5 3 4

Input:
10 99 44 22 56 63

Output:
99 10 63 22 56 44
'''

a=list(map(int,input().split(" ")))
a.sort()
n=len(a)
for i, j in zip(range(0,n//2), range(n-1,n//2-1, -1)):
    print(a[j],end=" ")
    print(a[i],end=" ")
if(n%2!=0):
    print(a[n//2],end=" ")
