package org.javapractice.array;

public class examples {
    public static void main(String[] args) {
        int[] nums = {4};
        int call = sum2(nums);
        System.out.println(call);
    }

    public static int sum2(int[] nums) {
        int sum =0;
        if(nums.length == 0){
            return 0;
        }else if (nums.length < 2) {
            sum = nums[0];
        }else {
            sum = nums[0]+nums[1];
        }
        return sum;

    }
}
