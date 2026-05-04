import java.util.Scanner;

public class SplitText {

    // Find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    // User-defined split method using charAt()
    public static String[] manualSplit(String str) {
        int len = findLength(str);
        int words = 1;

        // Count words
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];
        String temp = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                result[index] = temp;
                index++;
                temp = "";
            }
        }

        result[index] = temp;
        return result;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userSplit = manualSplit(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("\nWords using user-defined method:");
        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);

        sc.close();
    }
}