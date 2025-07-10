class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            // ArrayList<Integer> temp=new ArrayList<>();
            ans.add(lineWise(i));
        }
        return ans;
    }
    private List<Integer> lineWise(int n){
        ArrayList<Integer> temp=new ArrayList<>();
        int res=1;
        for(int i=1;i<=n;i++){
            temp.add(res);
            res*=(n-i);
            res/=(i);
        }
        return temp;
    }
}