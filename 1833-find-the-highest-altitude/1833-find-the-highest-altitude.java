class Solution {
    public int largestAltitude(int[] gain) {
        int k[]=new int[gain.length+1];
        k[0]=0;
        int s1=0;
        int s2=0;
        for(int i=0;i<gain.length;i++){
            k[i+1]=k[i]+gain[i];
            s1=Math.max(k[i],s1);
            s2=Math.max(k[i+1],s1);
        }
        return s2;
    }
}