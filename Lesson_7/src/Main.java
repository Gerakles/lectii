public class Main {

    public static void main (String[] args) {

        Person p1 = new Person();
        p1.setName("a");
        p1.setSurname("b");

        System.out.println(p1);

        Person p2 = new Person("a","b", 78);
        System.out.println(p2);

        String a = "andrei";
        String b = "andrei";
    }
}
