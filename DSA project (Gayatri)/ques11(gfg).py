#User function Template for python3

class Solution:
    def commonElements(self, arr1, arr2, arr3):
        i, j, k = 0, 0, 0
        n1, n2, n3 = len(arr1), len(arr2), len(arr3)
        result = []

        while i < n1 and j < n2 and k < n3:
            
      
            while i > 0 and i < n1 and arr1[i] == arr1[i - 1]:
                i += 1
           
            while j > 0 and j < n2 and arr2[j] == arr2[j - 1]:
                j += 1
            
            while k > 0 and k < n3 and arr3[k] == arr3[k - 1]:
                k += 1

            if i >= n1 or j >= n2 or k >= n3:
                break
            
          
            if arr1[i] == arr2[j] and arr2[j] == arr3[k]:
                result.append(arr1[i])
                i += 1
                j += 1
                k += 1
            
           
            else:
                current_min = min(arr1[i], arr2[j], arr3[k])
                
                if arr1[i] == current_min:
                    i += 1
                
                if arr2[j] == current_min:
                    j += 1
                
                if arr3[k] == current_min:
                    k += 1

        return result
