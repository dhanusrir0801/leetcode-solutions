class Solution {
    public int[] numberOfLines(int[] widths, String s) {

        int lines = 1;
        int width = 0;

        for (int i = 0; i < s.length(); i++) {

            int letterWidth = widths[s.charAt(i) - 'a'];

            if (width + letterWidth > 100) {
                lines++;
                width = letterWidth;
            } else {
                width = width + letterWidth;
            }
        }

        return new int[]{lines, width};
    }
}