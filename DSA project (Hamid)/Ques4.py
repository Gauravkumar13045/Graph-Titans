def remove_duplicates(nums):
    if not nums:
        return 0
    
    k = 1  # This is pointer for the next unique element
    
    for i in range(1, len(nums)):
        if nums[i] != nums[i - 1]:
            nums[k] = nums[i]
            k += 1
    
    return k

# Example usage
nums = [1, 1, 2]
k = remove_duplicates(nums)
print(k)        # Output: 2
print(nums[:k]) # Output: [1, 2]
