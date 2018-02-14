public class HappyBirthday {
    public static int yakim(String words) {
        int a = 0;
        for (int i = 0; i <words.length() ; i++) {
            if (Character.isLetter( words.charAt( i ) ))
                a++;
        }
        return a;
    }
}