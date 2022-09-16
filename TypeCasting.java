

public class TypeCasting {
    public static void main(String[] args) {

        //converting float to integer
        int a = (int)(20.505f);
        System.out.println(a);//20

        //converting character to integer
        int b = 'a';
        System.out.println(b);//97 -- ASCII of a

        //converting integer to float
        float c = 10;
        System.out.println(c);//10.0

        //converting integer to byte
        byte d = (byte)(500);
        System.out.println(d);//random value -- because byte can store up to 256 numbers

        byte e = (byte) 100;
        System.out.println(e);

    }
}
