package Module8;

class ValidAnagram {

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        int count[] = new int[26];

        for(int i=0;i<s.length();i++)
            count[s.charAt(i)-'a']++;

        for(int i=0;i<t.length();i++)
            count[t.charAt(i)-'a']--;

        boolean isAnagram = true;

        for(int i=0;i<26;i++){
            if(count[i]!=0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
