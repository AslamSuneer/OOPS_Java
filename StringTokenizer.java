import java.util.*;

public class Token {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter numbers: ");
        String s = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(s, " ");
        
        System.out.println("Individual Integers:");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            int num = Integer.parseInt(token);
            System.out.println(num);
            sum += num;
        }

        System.out.println("SUM = " + sum);
    }
}
