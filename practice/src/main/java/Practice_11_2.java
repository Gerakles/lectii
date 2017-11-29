public class Practice_11_2 {
    public static void main(String[]args) {
        System.out.println(calcPractice_11_2(1, 500));
        System.out.println(calcPractice_11_2(1, 1000));
        System.out.println(calcPractice_11_2(2, 500));
        System.out.println(calcPractice_11_2(2, 1000));
        System.out.println(calcPractice_11_2(3, 100));
        System.out.println(calcPractice_11_2(3, 1000));
        System.out.println(calcPractice_11_2(4, 600));
    }

    public static double calcPractice_11_2(int type, int amount) {
        double Practice_11_2 = 0;
        if(type == 1 ) {
            if (amount > 900) {
                Practice_11_2 = amount * 0.1;
            }else {
                Practice_11_2 = amount* 0.05;
            }
        }else if (type ==2){
            if (amount > 900){
                Practice_11_2 = amount * 0.07;
            } else {
                Practice_11_2 = amount* 0.0;
            }
        }else if(type ==3){
                if (amount < 500) {
                    Practice_11_2 = amount * 0.08;
                } else {
                    Practice_11_2 = amount* 0.05;
                }

        }else  {
            System.out.println("default");
        }
        return Practice_11_2;
    }
}
//    public class Order {
//        static final char CORP = 'C';
//        static final char PRIVATE = 'P';
//        static final char NONPROFIT = 'N';
//        String name, stateCode;
//        double total, discount;
//        char custType;
//
//        public Order(String name, double total, String state, char custType) {
//            this.name = name;
//            this.total = total;
//            this.stateCode = state;
//            this.custType = custType;
//            calcDiscount();
//        }
//
//        public String getDiscount(){
//            return Double.toString(discount) + "%";
//        }
//
//        // Code the calcDiscount method.
//        public void calcDiscount() {
//            if (custType == NONPROFIT){
//                if (total > 900){
//                    discount = 10.00;
//                }else discount = 5.00;
//            }else if (custType == PRIVATE){
//                if (total > 900){
//                    discount = 7.00;
//                }else discount = 0;
//            }else if (custType == CORP){
//                if (total < 500){
//                    discount = 8.00;
//                }else discount = 5.00;
//            }
//        }
//    }
//
//}
