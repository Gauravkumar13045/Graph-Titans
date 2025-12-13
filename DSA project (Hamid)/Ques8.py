def find_duplicate(nums):
    slow = nums[0]
    fast = nums[0]

    # Phase 1: detect cycle
    while True:
        slow = nums[slow]
        fast = nums[nums[fast]]
        if slow == fast:
            break

    # Phase 2: find cycle entrance
    slow2 = nums[0]
    while slow2 != slow:
        slow = nums[slow]
        slow2 = nums[slow2]

    return slow

# Example usage
nums = [3, 1, 3, 4, 2]
print(find_duplicate(nums))  # Output: 3
