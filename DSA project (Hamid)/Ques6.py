def sort_colors(nums):
    low = 0
    mid = 0
    high = len(nums) - 1
    
    while mid <= high:
        if nums[mid] == 0:
            nums[low], nums[mid] = nums[mid], nums[low]
            low += 1
            mid += 1
        
        elif nums[mid] == 1:
            mid += 1
        
        else:  # nums[mid] == 2
            nums[high], nums[mid] = nums[mid], nums[high]
            high -= 1
    
    return nums

nums = [2, 0, 1]
print(sort_colors(nums))  # Output: [0, 1, 2]
