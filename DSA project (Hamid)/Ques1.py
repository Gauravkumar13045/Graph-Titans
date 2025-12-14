def has_pair_with_sum(arr, target):
    n = len(arr)
    for i in range(n):
        for j in range(i+1, n):   
            if arr[i] + arr[j] == target:
                return True
    return False


# Example usage:
arr = [2, 7, 11, 15]
target = 9
print(has_pair_with_sum(arr, target)) 
