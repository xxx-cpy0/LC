class Solution {
    public void generate(List<String> a,int cc,int oc,StringBuilder sb,int n){
        if(oc == n && cc == n){
            a.add(sb.toString());
            return;
        }
        if(oc < n){
            sb.append('(');
            generate(a,cc,oc + 1,sb,n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(oc > 0 && cc < oc){
            sb.append(')');
            generate(a,cc + 1,oc,sb,n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans,0,0,new StringBuilder(),n);
        return ans;
    }
}