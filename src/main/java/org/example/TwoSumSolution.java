package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 数组的长度
        int[] nums = new int[n];
        
        // 读取数组元素
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int target = sc.nextInt(); // 目标值

        // 调用twoSum方法
        int[] result = twoSum(nums, target);
        
        // 输出结果
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[1] = i;
                res[0] = map.get(temp);
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}