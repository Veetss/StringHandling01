public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";

        char[] charArray = string1.substring(0, 2).concat(string2.substring(10, 12)).toCharArray();
        //char[] charArray = {string1.charAt(0), string1.charAt(1), string2.charAt(10), string2.charAt(11)};

        System.out.print(charArray);
    }
}
