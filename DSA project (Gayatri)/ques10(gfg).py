import sys

class Solution:
    def firstRepeated(self, arr):
        n = len(arr)
        min_first_index = sys.maxsize 
        
        for i in range(n):
            for j in range(i + 1, n):
                
                if arr[i] == arr[j]:
                    current_1_based_index = i + 1
                    
                    if current_1_based_index < min_first_index:
                        min_first_index = current_1_based_index
                        
                    break 
            
            if i + 1 == min_first_index and min_first_index != sys.maxsize:
                 break

        if min_first_index == sys.maxsize:
            return -1
        else:
            return min_first_index
