class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        countS, countT = {}, {} # How maps can be created

        # Build the hashmap
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countT.get(t[i], 0)

        # Iterate through and make sure the count is the same 
        for c in countS:
            if countS[c] != countT.get(c, 0):
                return False
        return True
