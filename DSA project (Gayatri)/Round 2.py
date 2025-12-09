class Solution:
    def pivotIndex(self, nums: List[int] ) ->int   :
        left_sum = 0
        right_sum =sum(nums)
        for i in range(len(nums)):
            right_sum -= nums[i]
            if right_sum == left_sum:
                return i 
            left_sum += nums[i]
        return -1

# Missing numbers

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n= len(nums)
        sums = n*(n+1)//2
        realsum = sum(nums)
        return sums - realsum 

        
