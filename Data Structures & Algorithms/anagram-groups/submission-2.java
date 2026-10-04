class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String currentWord = strs[i];
            int count[] = new int[26];

            for (int j = 0; j < currentWord.length(); j++) {
                char letter = currentWord.charAt(j);
                count[letter - 'a']++;
            }

            String key = Arrays.toString(count);

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }

            res.get(key).add(currentWord);
        }
        return new ArrayList<>(res.values());
    }
}
