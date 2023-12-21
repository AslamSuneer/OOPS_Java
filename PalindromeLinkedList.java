import java.util.Scanner;

class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(char data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public LinkedList reverse() {
        LinkedList reversedList = new LinkedList();
        Node current = head;

        while (current != null) {
            reversedList.insert(current.data);
            current = current.next;
        }

        return reversedList;
    }

    public boolean isPalindrome() {
        LinkedList reversedList = reverse();
        Node originalCurrent = head;
        Node reversedCurrent = reversedList.head;

        while (originalCurrent != null && reversedCurrent != null) {
            if (originalCurrent.data != reversedCurrent.data) {
                return false;
            }
            originalCurrent = originalCurrent.next;
            reversedCurrent = reversedCurrent.next;
        }

        return true;
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase(); // Convert the word to lowercase

        LinkedList linkedList = new LinkedList();

        // Insert each character into the linked list
        for (int i = 0; i < word.length(); i++) {
            linkedList.insert(word.charAt(i));
        }

        // Check if the word is a palindrome
        if (linkedList.isPalindrome()) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
