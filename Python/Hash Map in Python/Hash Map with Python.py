from collections import defaultdict
xx=defaultdict(int)
x=["John","Die","Dead"]
for y in x:
    xx[y]=xx[y]+2
print(xx)