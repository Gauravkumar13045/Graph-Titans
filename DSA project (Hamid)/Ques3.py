def missing_number(nums):
    n = len(nums)
    total_sum = n * (n + 1) // 2  # Sum of numbers from 0 to n
    return total_sum - sum(nums)

# Example usage
nums = [3, 0, 1]
print(missing_number(nums))  # Output: 2
