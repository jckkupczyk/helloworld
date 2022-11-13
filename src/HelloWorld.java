public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");

        String sentence = "Hello World!!!";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }
    }

}
