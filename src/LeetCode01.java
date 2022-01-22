
/*
* https://leetcode.com/problems/two-sum/
* Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class LeetCode01 {
    public static void main(String[] args) {
      ListNode res =  addTwoNumbers(new ListNode(4,new ListNode(8)),new ListNode(5,new ListNode(4,new ListNode(4))));

        while(res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }

    public static int[] twoSums(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode cur = temp;
        int carry = 0;
        while(l1 !=null || l2 !=null || carry!=0){
            int sum = 0;

            if(l1!=null || l2!=null) {
                int a = l1==null? 0: l1.val;
                int b = l2==null? 0: l2.val;
                sum = a+b;
            }
            if(carry!=0){
                sum+=carry;
                carry=0;
            }
            if(sum>=10){
                carry = sum/10;
                sum = sum%10;
            }

            cur.next = new ListNode(sum);
            cur = cur.next;
            l1 = (l1!=null)? l1.next:l1;
            l2= (l2!=null)? l2.next:l2;
        }


        return temp.next;
    }
}
