package com.leetcode.twosum;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums,6);
        if(result!=null && result.length>0)
        {
            System.out.println("indexes: "+result[0]+", "+result[1]);
        }

        System.out.println( "Hello World!" );
    }

    public static int[] twoSum (int[] nums, int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            for(int k=i+1; k<=nums.length-1; k++)
            {
                if((nums[i]+nums[k])==target)
                    return new int[]{i,k};
            }
        }
        return null;
    }
}
