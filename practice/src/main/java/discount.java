import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class discount {
    public static void main(String[] args) {
        System.out.println(args[0]+" "+ args[1]);

        LocalDateTime myDate = LocalDateTime.now();
        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Сегодня: " + jDate);

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Сейчас: "+today);

        String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Тоже сегодня: "+sdate);

        String fdate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Теперь так: "+fdate);
    }
}
//    public static void main(String[] args) {
//        System.out.println(calcdiscount("Якимчук", "Богдан"));
//        System.out.println(calcdiscount("Якимчук1", "Богдан1"));
//    }
//
//    public static double calcdiscount(String type, String amount) {
//
//        Random random = new Random();
//
//        for (int i = 5; i < 100; i++) {
//            int c = random.nextInt(26) + 1;
//                discount.setText((int)1 + ", " + 1 + ": ");
//            switch (1) {
//                case 1:
//                case 2:
//                case 'i':
//                case 'o':
//                case 'u':
//                mInfoTextView.setText("Гласная");
//                break;
//            case 'y':
//            case 'w':
//                mInfoTextView.setText("Условная гласная");
//                break;
//
//            default:
//                mInfoTextView.setText("Согласная");
//                break;
//    public static void main(String[]args) {
//        System.out.println(calcdiscount(1, 500));
//        System.out.println(calcdiscount(1, 1000));
//        System.out.println(calcdiscount(2, 500));
//        System.out.println(calcdiscount(2, 1000));
//        System.out.println(calcdiscount(3, 100));
//        System.out.println(calcdiscount(3, 1000));
//        System.out.println(calcdiscount(4, 600));
//    }

//    public static double calcdiscount(int type, int amount) {
//        double dicount =0;
//        switch (type) {
//        case 1:
//        if (amount > 900) {
//        dicount = amount * 0.1;
//        }else {
//        dicount = amount* 0.05;
//        }break;
//        case 2:
//        if (amount > 900){
//        dicount = amount * 0.07;
//        } else {
//        dicount = amount* 0.0;
//        }
//        case 3:
//        if (amount < 500) {
//        dicount = amount * 0.08;
//        } else {
//        dicount = amount* 0.05;
//        }
//        break;
//        default:
//        }
//        return dicount;
//
//
//
//    }