public class HappyBirthday {
    public static int yakim(String words) {
        int count = 0;
        for (int i = 0; i <words.length() ; i++) {
            if (Character.isLetter( words.charAt( i ) ))
                count++;
        }
        return count;
    }
}
