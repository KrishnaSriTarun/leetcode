class Solution(object):
   def sortArrayByParity(self, nums): 
       
       even_nums = []
       odd_nums = []
       
       for x in nums: 
           if x % 2 == 0: 
               even_nums.append(x)
           else: 
               odd_nums.append(x)
               
       array_by_parity = even_nums + odd_nums
       
       return array_by_parity

        
        