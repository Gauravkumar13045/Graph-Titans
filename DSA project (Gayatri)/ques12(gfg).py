class Solution:
    def factorial(self, n):
        
        if n == 0 or n == 1:
            return [1]
        
        result = [1]
        
        for i in range(2, n + 1):
            self.multiply(result, i)
            
        
        result.reverse()
        return result

    def multiply(self, result_list, multiplier):

        carry = 0
        
        
        for j in range(len(result_list)):
            
            prod = result_list[j] * multiplier + carry
            
            
            result_list[j] = prod % 10
            
            
            carry = prod // 10
            
        
        while (carry):
            
            result_list.append(carry % 10)
            
            
            carry = carry // 10
            
