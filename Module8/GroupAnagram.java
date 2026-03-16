package Module8;

import java.util.*;

class GroupAnagrams {

    public static void main(String[] args) {

        String strs[] = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String word : strs){

            char arr[] = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key))
                map.put(key,new ArrayList<>());

            map.get(key).add(word);
        }

        for(ArrayList<String> group : map.values())
            System.out.println(group);
    }
}
