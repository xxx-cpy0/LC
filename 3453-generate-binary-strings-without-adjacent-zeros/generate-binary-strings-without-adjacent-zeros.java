class Solution {
    public void helper(int idx,int n,List<String> ll,StringBuilder sb){
        if(idx >= n){
            ll.add(sb.toString());
            return;
        }
        if(sb.isEmpty() || sb.charAt(sb.length() - 1) != '0'){
            sb.append('0');
            helper(idx + 1,n,ll,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append('1');
        helper(idx + 1,n,ll,sb);
        sb.deleteCharAt(sb.length() - 1);
    }
    public List<String> validStrings(int n) {
        List<String> ll = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(0,n,ll,sb);
        return ll;
    }
}