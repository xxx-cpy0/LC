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
    public void helper(int r,int n,int c,List<Integer> l,char[][] arr){
        if(r == n){
            l.add(c);
           // System.out.print(c+" ");
            return;
        }
        for(int i=0;i<n;i++){
            if(isvalid(arr,r,i)){
                arr[r][i] = 'Q';
                helper(r+1,n,c,l,arr);
                arr[r][i] = ' ';
            }
        }
    }
    public int totalNQueens(int n) {
        char[][] aa = new char[n][n];
        int i,j,c = 0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                aa[i][j] = ' ';
            }
        }
        List<Integer> l = new ArrayList<>();
        helper(0,n,c,l,aa);
        return l.size();
    }
}