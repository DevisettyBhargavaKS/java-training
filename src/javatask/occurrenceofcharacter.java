package javatask;

public class occurrenceofcharacter {
    public static void main(String[] args) {
        String str = "bhargava";
        char ch = 'a';
        int count = 0;
        for ( int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        System.out.println("occurrences of "+ch+" are " +count);

    }
}
