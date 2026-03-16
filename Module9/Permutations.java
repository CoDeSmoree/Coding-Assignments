package Module9;

import java.util.*;

class Permutations {

    static void permute(int nums[], boolean used[], List<Integer> current){

        if(current.size()==nums.length){
            System.out.println(current);
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i])
                continue;

            used[i] = true;
            current.add(nums[i]);

            permute(nums,used,current);

            current.remove(current.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args){

        int nums[] = {1,2,3};

        permute(nums,new boolean[nums.length],new ArrayList<>());
    }
}
