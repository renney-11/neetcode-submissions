class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = defaultdict(list)

        for s in strs:
            # Create a list of 26 zeros (one for each letter a-z)
            count = [0] * 26

            # Count how many times each letter appears
            for c in s:
                count[ord(c) - ord("a")] += 1

            # Lists can't be dictionary keys, so convert it to a tuple
            hashmap[tuple(count)].append(s)

        return list(hashmap.values())