class Solution {
    public int bulbSwitch(int n) {
        List arr = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            
            arr.add(i*i);
        }
        
        return arr.size();
    }
}