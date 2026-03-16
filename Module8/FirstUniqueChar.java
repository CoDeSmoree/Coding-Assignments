package Module8;

class FirstUniqueChar {

    public static void main(String[] args) {

        String s = "leetcode";

        int count[] = new int[26];

        for(int i=0;i<s.length();i++)
            count[s.charAt(i)-'a']++;

        for(int i=0;i<s.length();i++){

            if(count[s.charAt(i)-'a']==1){
                System.out.println("First Unique Character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No unique character");
    }
}
