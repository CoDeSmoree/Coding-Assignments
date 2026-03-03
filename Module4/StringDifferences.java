package Module4;
// Write a program to demonstrate the difference between String, StringBuilder, and
//StringBuffer.
public class StringDifferences {
    public static void main(String[] args) {
        String s="String";
        System.out.println(s+" is the String before change");
        System.out.println("String after change: "+s);
        //here it shows that string cannot be changed and it remains the same

        StringBuffer sbuff= new StringBuffer();
        sbuff.append("StringBuffer");
        sbuff.append(" is mutable");
        sbuff.append(" but it not thread safe.");
        System.out.println(sbuff);

        StringBuilder sbuild= new StringBuilder();
        sbuild.append("StringBuilder");
        sbuild.append(" is mutable,");
        sbuild.append("but it is thread safe.");
        System.out.println(sbuild);
    }
}
