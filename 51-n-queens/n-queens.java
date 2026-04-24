class Solution {
    boolean isvalid(char[][] a,int r,int col){
        int i,j,c = 0,c1 = 0,cc = 0;
        for(i=0;i<a.length;i++){
            if(a[r][i] == 'Q') c++;
            if(a[i][col] == 'Q') c1++;
        }
        if(c1 > 0 || c > 0) return false;
        c = 0;
        int x = r,y = col;
        while(y >= 0 && x >= 0){
            if(a[x][y] == 'Q') c++;
            x--;
            y--;
        }
        if(c > 0) return false;
        int sum = r + col;
        c = 0;
        x = r;
        y = col;
        while(x >= 0 && y < a.length){
            if(a[x][y] == 'Q') c++;
                x--;
                y++;
        }
        if(c > 0) return false;
        return true;
    }
    public void helper(int r,int n,List<List<String>> b,char[][] c){
        if(r == n){
            int k,m;
            List<String> a = new ArrayList<>();
            for(m=0;m<n;m++){
                StringBuilder sb = new StringBuilder();
                for(k=0;k<n;k++){
                    if(c[m][k] == ' ') sb.append('.');
                    else if(c[m][k] == 'Q') sb.append('Q');
                }
                a.add(sb.toString());
            }
            b.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<n;i++){
            if(isvalid(c,r,i)){
                c[r][i] = 'Q';
                helper(r+1,n,b,c);
                c[r][i] = ' ';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> l = new ArrayList<>();
        char[][] aa = new char[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                aa[i][j] = ' ';
            }
        }
        helper(0,n,l,aa);
        return l;        
    }
}