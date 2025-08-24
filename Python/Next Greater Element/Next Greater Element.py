#You are given an array of integers arr of size n. For each element in the array, find the Next Greater Element (NGE) — the first element to the right that is strictly greater than the current element. If no such element exists, assign -1 for that position.
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'nextGreaterElements' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY inputArr as parameter.
#

def nextGreaterElements(inputArr):
    n=len(inputArr)
    result=[-1]*n
    sta=[]
    for i in range(n):
        while sta and inputArr[i]>inputArr[sta[-1]]:
            ix=sta.pop()
            result[ix]=inputArr[i]
        sta.append(i)
    return result

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = nextGreaterElements(arr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
