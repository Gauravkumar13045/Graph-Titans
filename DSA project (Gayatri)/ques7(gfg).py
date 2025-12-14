class Solution:
    def segregateElements(self, arr):
        n = len(arr)
        
        
        temp = []
        
        
        for x in arr:
            if x >= 0:
                temp.append(x)
        
       
    
        for x in arr:
            if x < 0:
                temp.append(x)
                
        
        for i in range(n):
            arr[i] = temp[i]
