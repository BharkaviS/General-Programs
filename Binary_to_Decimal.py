#Converion fo Binary to Decimal without using in-built function
bnum=int(input())
decnum=0
r=0
i=0
while(bnum>0):
    r=bnum%10
    rem=r*(2**i)
    decnum=decnum+rem
    i=i+1
    bnum=bnum//10
print(decnum)
