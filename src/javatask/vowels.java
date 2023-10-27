package javatask;


public class vowels {
    public static void main(String[] args) {
        String str = "bhargava";
        String str2 = "";
        str2 = str.replaceAll("[aeiou]","");
        System.out.println("String after removing vowel : " + str2);
    }
}