def find_disappeared_numbers(nums):
    #We have to mark indices corresponding to seen numbers
    for num in nums:
        index = abs(num) - 1
        if nums[index] > 0:
            nums[index] = -nums[index]

    # we should collect indices that were never marked
    result = []
    for i in range(len(nums)):
        if nums[i] > 0:
            result.append(i + 1)

    return result

# Example usage
nums = [4,3,2,7,8,2,3,1]
print(find_disappeared_numbers(nums))  # Output: [5, 6]
