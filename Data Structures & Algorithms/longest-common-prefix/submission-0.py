class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        strs.sort()

        firstString = strs[0]
        lastString = strs[-1]

        output = ""

        for n in range(len(firstString)):
            if firstString[n] == lastString[n]:
                output += firstString[n]
            else:
                break
        return output