class Solution {
    public int[][] merge(int[][] inter) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        int n=inter.length;
        Arrays.sort(inter, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            int start=inter[i][0];
            int end=inter[i][1];
            // if(!temp.isEmpty() && end<=temp.get(1)){
            //     continue;
            // }
            int j = i + 1;
            while (j < n && inter[j][0] <= end) {
                end = Math.max(end, inter[j][1]);
                j++;
            }
            i = j - 1;

            temp.add(start);
            temp.add(end);
            ans.add(temp);
        }
        int[][] result = new int[ans.size()][2];
        for (int k = 0; k < ans.size(); k++) {
            result[k][0] = ans.get(k).get(0);
            result[k][1] = ans.get(k).get(1);
        }
        return result;
    }
}