package Module9;

import java.util.*;

class CombinationSum {

    static void solve(int nums[], int target, int index, List<Integer> current){

        if(target == 0){
            System.out.println(current);
            return;
        }

        if(target < 0)
            return;

        for(int i=index;i<nums.length;i++){

            current.add(nums[i]);

            solve(nums,target-nums[i],i,current);

            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args){

        int nums[] = {2,3,6,7};
        int target = 7;

        solve(nums,target,0,new ArrayList<>());
    }
}
