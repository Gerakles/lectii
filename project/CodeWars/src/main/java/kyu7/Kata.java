package kyu7;

class Kata {
    public static String getMiddle(String word) {
        String a = word;
        int position;
        int lenght;
        if (a.length() % 2 == 1){
            position = a.length() / 2;
        lenght = 1;
    }else {
            position = a.length()/2-1;
            lenght=2;
        }
        String answer = a.substring( position,position+lenght );
        return answer;
    }
}