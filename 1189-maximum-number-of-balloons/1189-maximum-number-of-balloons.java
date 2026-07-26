class Solution {
    public int maxNumberOfBalloons(String text) {
        int b_freq =0;
        int a_freq =0, l_freq=0,o_freq=0,n_freq =0;
        // [] b a l/2 o/2 n
        for(int i =0;i<text.length();i++){
            char c = text.charAt(i);
            if(c=='b'){b_freq++;}
            else if(c=='a'){a_freq++;}
            else if(c=='l'){l_freq++;}
            else if (c=='o'){o_freq++;}
            else if(c=='n'){n_freq++;}
        }
     
        return Math.min(b_freq,Math.min(a_freq,Math.min(l_freq/2,Math.min(o_freq/2, n_freq))));
    }
}