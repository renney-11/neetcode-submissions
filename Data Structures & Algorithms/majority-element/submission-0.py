class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hashmap = {}
        majority = len(nums)//2

        for n in nums:
            hashmap[n] = hashmap.get(n, 0) + 1
        
        for n in hashmap:
            if hashmap[n] > majority:
                return n

                