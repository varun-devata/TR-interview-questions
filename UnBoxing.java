public class UnBoxing {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        int i = a.intValue();
        int j = a;
        System.out.println(a);
        System.out.println(i);
        System.out.println(j);

    }
}
