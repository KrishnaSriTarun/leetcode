class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
            }
            else if(nums[i]==1){
                b++;
            }
            else if(nums[i]==2){
                c++;
            }
        }
        for(int i=0;i<a;i++){
            nums[i]=0;
        }
        for(int j=a;j<a+b;j++){
            nums[j]=1;
        }
        for(int k=a+b;k<a+b+c;k++){
            nums[k]=2;
        }
    }
}