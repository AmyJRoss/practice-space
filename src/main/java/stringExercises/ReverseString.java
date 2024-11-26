package stringExercises;

import java.util.Scanner;

public class ReverseString {
    //with stringbuider
    public static String reverseString1(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    //with for loop
    public static String reverseString2(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }
    //with two pointers
    public static String reverseString3(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            char c = arr[left];
            arr[left]=arr[right];
            arr[right]=c;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("StringnBuilder: " + reverseString1(input));
        System.out.println("For loop: "+reverseString2(input));
        System.out.println("Two pointer: "+reverseString3(input));
    }
}
