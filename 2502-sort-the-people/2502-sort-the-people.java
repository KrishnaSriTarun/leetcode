class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<names.length;i++){
            int max=i;
            for(int j=i+1;j<names.length;j++){
                if(heights[max] < heights[j]){
                    max=j;
                }
            }
            int temp=heights[max];
            heights[max]=heights[i];
            heights[i]=temp;
            String k=names[max];
            names[max]=names[i];
            names[i]=k;
        }
        return names;
    }
}