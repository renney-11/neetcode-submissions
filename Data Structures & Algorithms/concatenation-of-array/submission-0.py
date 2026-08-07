class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []

        for i in range(2): # We are doing it twice bcs the output
            for n in nums:
                ans.append(n) # Basically adds n to the end of the array
        return ans