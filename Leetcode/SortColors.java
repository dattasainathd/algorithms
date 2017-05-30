public class Solution {
    public void sortColors(int[] A) {
       if(A==null || A.length<2) return;
       int low = 0;
       int high = A.length-1;
       for(int i = low; i<=high;) {
           if(A[i]==0) {
              int temp = A[i];
              A[i] = A[low];
              A[low]=temp;
              i++;low++;
           }else if(A[i]==2) {
              int temp = A[i];
              A[i] = A[high];
              A[high]=temp;
              high--;
           }else {
               i++;
           }
       }
   }
}
/* public class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0,j = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                a++;
            else if(nums[i] == 1)
                b++;
            else
                c++;
        }
        while(j<a){
            nums[j]=0;
            j++;
        }
        while(j<a+b){
            nums[j]=1;
            j++;
        }
        while(j<a+b+c){
            nums[j]=2;
            j++;
        }
    }
}
*/
