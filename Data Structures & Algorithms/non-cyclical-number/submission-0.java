class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen= new HashSet<>();

        while(n!=1){
            n=calculate(n);
            if(seen.contains(n)) return false;
            seen.add(n);
        }

        return true;
    }

    public int calculate(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+= digit*digit;
             n /=10;
        }
        return sum;
    }
}
