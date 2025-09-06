if __name__ == '__main__':
    n = int(input())
    arr = set(map(int, input().split()))  # convert to list
    arr = sorted(arr, reverse=True)   # remove duplicates & sort descending
    print(arr[1])