import java.util.HashMap;

public class MaxRepeatingCharacterInString {
    public static void main(String[] args) {
        String string = "reema";
        MaxRepeatingCharacterInString maxRepeatingCharacterInString = new MaxRepeatingCharacterInString();
        maxRepeatingCharacterInString.findMaxRepeatingCharacterInString(string);
        maxRepeatingCharacterInString.countOccurences(string);
    }


    private void findMaxRepeatingCharacterInString(String string) {
        int count = 1;
        int max = 0;
        char maxchar = 0;
        char[] chars = string.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    maxchar = chars[i - 1];
                } else
                    count = 1;

            }
        }
        if (count >= max) {
            max = count;
            maxchar = chars[chars.length - 1];
        }
        System.out.println("max char is " + maxchar);
    }

    private void countOccurences(String string) {
        HashMap<Character,Integer> countMap=new HashMap<Character, Integer>();
        char[] charArray = string.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(!countMap.containsKey(charArray[i])){
                countMap.put(charArray[i],1);
            }
            else
            {
                countMap.put(charArray[i],countMap.get(charArray[i])+1);
            }
            }
        System.out.println("count of occurences : "+ countMap);
        }
    }


