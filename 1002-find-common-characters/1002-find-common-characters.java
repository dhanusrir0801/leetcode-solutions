class Solution {
    public List<String> commonChars(String[] words) {

        int[] common = new int[26];

        for (char ch : words[0].toCharArray()) {
            common[ch - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {

            int[] count = new int[26];

            for (char ch : words[i].toCharArray()) {
                count[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], count[j]);
            }
        }

        List<String> answer = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (common[i] > 0) {
                answer.add(String.valueOf((char) ('a' + i)));
                common[i]--;
            }
        }

        return answer;
    }
}