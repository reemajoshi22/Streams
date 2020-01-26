import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        anagram.isAnagram("reema", "meeraaa");
        int i = anagram.deletionsRequiredToMakeAnagram("reema", "kartik");
        System.out.println("i is : " + i);

    }

    private void isAnagram(String reema, String meera) {
        char[] chars = reema.toCharArray();
        char[] chars1 = meera.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);
        if (chars.length != chars1.length)
            System.out.println("Not a anagram ");
        if (Arrays.equals(chars, chars1))
            System.out.println("anagram");

    }

    private static int deletionsRequiredToMakeAnagram(String string1, String string2) {
        int count1[] = new int[26];
        int count2[] = new int[26];

        // count frequency of each character
        // in first string
        for (int i = 0; i < string1.length(); i++)
            count1[string1.charAt(i) - 'a']++;

        for (int i = 0; i < string2.length(); i++)
            count2[string2.charAt(i) - 'a']++;


// traverse count arrays to find
        // number of characters to be removed
        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] -
                    count2[i]);
        return result;
    }
}