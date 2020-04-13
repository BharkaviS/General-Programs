stack = []
a=[]
while(True):
    n=input()
    if(n[0]=='1'):
        stack.append(n[2:])
    elif(n[0]=='-' and len(stack)>0):
        stack.pop()
    elif(n[0]=='2' and len(stack)>0):
        x=stack[-1]
        a.append(x)
    elif(n[0]=='0'):
        break;
print(*a)
