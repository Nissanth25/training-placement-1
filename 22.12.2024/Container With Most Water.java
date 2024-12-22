class Solution {
    public int maxArea(int[] arr) {
        int max = 0 , i = 0, j = arr.length - 1;
        while(i < j){
            int minH = Math.min(arr[i], arr[j]);
            int test = (j - i) * minH;
            if(max < test) max = test;
            if(arr[i] <= arr[j]) i++ ;
            else j--;
        }
        return max;
    }
}
