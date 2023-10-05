import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int i, f = 0;
        char x;

        System.out.println("Enter the String: ");
        str = sc.nextLine().toUpperCase(); // Convert the input string to uppercase

        System.out.println("Enter the character to search: ");
        x = Character.toUpperCase(sc.next().charAt(0)); // Convert the search character to uppercase

        int len = str.length();

        for (i = 0; i < len; i++) {
            if (str.charAt(i) == x) {
                f++;
            }
        }

        if (f == 0) {
            System.out.println("Character is not in String");
        } else {
            System.out.println("Character is present and frequency is " + f);
        }
    }
}
