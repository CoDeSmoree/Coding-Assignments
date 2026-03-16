package Module9;

import java.util.*;

class Subsets {

    static void findSubsets(int nums[], int index, List<Integer> current) {

        System.out.println(current);

        for(int i=index;i<nums.length;i++){

            current.add(nums[i]);

            findSubsets(nums,i+1,current);

            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {

        int nums[] = {1,2,3};

        findSubsets(nums,0,new ArrayList<>());
    }
}
