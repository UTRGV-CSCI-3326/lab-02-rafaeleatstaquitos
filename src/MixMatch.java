public class MixMatch {
    public static void main(String[] args) {
        String text = "Hello";
        char character = 'c';
        short shortnum = 1;
        int num = 23;
        long longnum = 235;
        float floatnum = 3.14f;
        double doublenum = 3.14159;
        boolean state = true;

        System.out.println(text + " <- This is a string which stores a string of text or characters");
        System.out.println(character + " <- This is a char it stores a single character/letter or ASCII values");
        System.out.println(shortnum + " <- This is a short it can store numbers from -32,768 and 32,767");
        System.out.println(num + " <- This is an integer it can store numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(longnum + " <- This is a long it stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(floatnum + " <- This is a float ehich can store fractional numbers, sufficient for storing 6 to 7 decimal digits");
        System.out.println(doublenum + " <- This is a double it can store fractional numbers, sufficient for storing 15 to 16 decimal digit");
        System.out.println(state + " <- stores true or false values");
        System.out.println(text + " " + character + " " + state);
    }
}