def two_sum_indices(arr, target):
    index_map = {}  # value -> index
    
    for i, num in enumerate(arr):
        diff = target - num
        if diff in index_map:
            return (index_map[diff], i)
        index_map[num] = i
    return None
