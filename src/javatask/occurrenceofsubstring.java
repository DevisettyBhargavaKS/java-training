package javatask;

public class occurrenceofsubstring {
    public static void main(String[] args) {
        String str = "java is java and java";
        String findStr = "java";
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1)
                count++;

            lastIndex += findStr.length();
        }
        System.out.println(count);
    }
}
