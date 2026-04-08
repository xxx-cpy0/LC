class Solution {
    public int myAtoi(String cleaned) {
        int i,c = 0,lc = 0,flag = 0;
        long ans = 0;
        String s = cleaned.trim();
        if(cleaned.isEmpty()) return 0;
        else{
            for(i=0;i<s.length();i++){
                if(s.charAt(i) == '.'){
                    if(ans > 0) return (int)ans;
                    else return 0;
                }
                else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                    c++;
                    if(i > 0){
                        break;
                    }
                    if(s.charAt(i) == '-') flag = 1;
                }
                else{
                    if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'z'){
                        break;
                    }
                    if(s.charAt(i) == ' '){
                        break;
                    }
                    int res = s.charAt(i) - '0';
                    ans = (ans * 10) + res;
                    if(ans > Integer.MAX_VALUE) break;
                }
                if(c > 2){
                    if(ans > 0) return (int)ans;
                    else return 0;
                }
            }
        }
        if(ans > Integer.MAX_VALUE){
            if(flag == 1) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        if(flag == 1) return  -1 * (int)ans;
        return (int)ans;
    }
}