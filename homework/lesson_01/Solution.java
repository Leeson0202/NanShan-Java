package lesson_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String str = "123";  // 在字符串常量池查找->没有，创建一个“123”字符串常量并放到池子里面，返回对象引用
        String str1 = "123"; // 在字符串常量池查找->有，直接返回对象引用
        String str2 = new String("123"); // 这里在堆里面创建了一个新对象 和常量池无关
        System.out.println(str == str1); // 两个都是指向常量池中的字符串常量“123”，“==“ 判断的是对象引用，true
        System.out.println(str == str2); // str为常量池中的“123”，str2是对里面的对象“123”，false

        System.out.println(new Solution().isPalindrome(9));


        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{3, 1, 2, 4}, 3)));
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    // 反转一半的数
    public boolean isPalindrome(int x) {
        // 负数、各位为0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reX = 0;
        while (x > reX) {
            reX = reX * 10 + x % 10;
            x = x / 10;
        }
        // 长度为偶数：直接相等
        // 长度为奇数：反转数/10等于原数
        return x == reX || reX / 10 == x;
    }
}
