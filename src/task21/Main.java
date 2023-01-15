package task21;

public class Main {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        String s3= new String("abc");
        System.out.println("s1 == s2 ? "+(s1==s2));
        System.out.println("s1 == s3 ? "+(s1==s3));
        System.out.println("s1 equals s3 ? "+(s1.equals(s3)));

//        foo();
    }


    static void foo() {
        String m = "Hello";
        m = m + 1;
        System.out.print(m);
        bar(m);
        System.out.print(m);
    }

    static void bar(String m) {
        m += " World!";
    }
}
