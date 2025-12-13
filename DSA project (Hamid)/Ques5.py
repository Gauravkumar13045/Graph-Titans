def find_max_average(nums, k):
    current_sum = sum(nums[:k])
    max_sum = current_sum
    
    for i in range(k, len(nums)):
        current_sum += nums[i] - nums[i - k]
        max_sum = max(max_sum, current_sum)
    
    return max_sum / k

# Example usage
nums = [5]
k = 1
print(find_max_average(nums, k))  # Output: 5.0
