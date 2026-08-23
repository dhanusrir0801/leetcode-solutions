class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left ; i<=right ; i++){
            if(self(i)){
                res.add(i);
            }
        }
        return res;
    }
    private boolean self(int num){
        int copy = num;
        while(num!=0){
            int rem = num%10;
            if(rem == 0){
                return false;
            }
            if(copy%rem!=0){
                return false;
            }
            num = num/10;
        }
        return true;
    }
}