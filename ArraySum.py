'''
Array Left sum = right sum

Input:
4
2 1 5 3

Output:
5
'''

def isTrue(i,a,n):
  ls=0
  rs=0
  for j in range(0,i):
    ls+=a[j]
  for j in range(i+1,n):
    rs+=a[j]
  if(ls==rs):
    return True
  return False
  
n=int(input())
a=list(map(int,input().split(" ")))
for i in range(0,n):
  if(isTrue(i,a,n)):
    print(a[i],end=" ")
