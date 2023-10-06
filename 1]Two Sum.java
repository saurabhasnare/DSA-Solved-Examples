//find the pair who sum is the target element
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int index1=0;
        int index2=0;
        int[]arr=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){

            int value=target-nums[i];
            if(map.containsKey(value) && map.get(value)!=i)
            {
                index1=i;
                index2=map.get(value);

                break;
            }
        }

        arr[0]=index1;
        arr[1]=index2;
        return arr;
    }
}
