class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] words = (s1 + " " + s2).split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> result = new ArrayList<>();

        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}