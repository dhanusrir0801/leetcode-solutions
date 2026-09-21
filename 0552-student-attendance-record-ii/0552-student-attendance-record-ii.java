class Solution {
    public int checkRecord(int n) {
        int MOD = 1000000007;

        long[][] dp = new long[2][3];

        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            long[][] next = new long[2][3];

            for (int a = 0; a <= 1; a++) {
                for (int l = 0; l <= 2; l++) {

                    long count = dp[a][l];

                    next[a][0] += count;
                    next[a][0] %= MOD;

                    if (a == 0) {
                        next[1][0] += count;
                        next[1][0] %= MOD;
                    }

                    if (l < 2) {
                        next[a][l + 1] += count;
                        next[a][l + 1] %= MOD;
                    }
                }
            }

            dp = next;
        }

        long answer = 0;

        for (int a = 0; a <= 1; a++) {
            for (int l = 0; l <= 2; l++) {
                answer += dp[a][l];
            }
        }

        return (int)(answer % MOD);
    }
}