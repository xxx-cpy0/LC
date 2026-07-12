class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(!hm.containsKey(i + j)) hm.put(i + j,new ArrayList<>());
                hm.get(i + j).add(mat[i][j]);
            }
        }
        int[] arr = new int[mat.length*mat[0].length];
        int direction = 1,point = 0;
        for(List<Integer> ll : hm.values()){
            if(direction == 0){
                for(int k : ll){
                    arr[point++] = k;
                }
            }
            else{
                for(int k = ll.size() - 1;k >= 0;k--){
                    arr[point++] = ll.get(k);
                }
            }
            direction ^= 1;
        }
        return arr;
    }
}