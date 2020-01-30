test=input("Enter the input:")
test_str=test[::-1]
v=test_str
a = [test_str[i: j] for i in range(len(test_str))
          for j in range(i + 1, len(test_str) + 1)]

a.sort()
a=list(dict.fromkeys(a))
for i in a:
    if(i==v):
        print("The rank is: ",a.index(i)+1)
print(*a)
