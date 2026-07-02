class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0,h=0,c=0;
        while(h < s.length()){
            if(!hm.containsKey(s.charAt(h))) hm.put(s.charAt(h),1);
            else hm.put(s.charAt(h),hm.get(s.charAt(h)) + 1);
            while(hm.size() == 3){
                if(hm.size() == 3) c += s.length() - h;
                if(hm.get(s.charAt(l)) <= 1) hm.remove(s.charAt(l));
                else hm.put(s.charAt(l),hm.get(s.charAt(l)) - 1);
                l++;
            }
            if(hm.size() == 3) c += s.length() - h;
            h++;
        }
        return c;
    }
}