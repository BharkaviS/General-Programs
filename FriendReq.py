'''
In a social network, a person can invite friends of his/her friend.John wants to invite and add new friends.
Complete the program below so that it prints the names of the persons to whom John can send frient request.

Input:
3
Mani 3 Ram Raj Guna
Ram 2 Kumar Kishore
suresh 2 pawan adhil

Output:
Raj Guna Kumar Kishore pawan adhil

Explanation:
Ram is already a friend of john and hence friend request cannot be sent again.

'''

n=int(input())
a=[]
b=[]
c=[]
d=[]


for i in range(0,n):
    a=list(map(str,input().split(" ")))
    b.append(a[0])
    for j in range(2,len(a)):
        c.append(a[j])
for x in b:
    for y in c:
        if(x!=y and y not in d and y not in b):
            d.append(y)
print(*d)
