package String;/*
* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/


import java.util.Stack;

/* 1.First convert it to alphanumeric and lowercase
*   2. check if string length is less than 2 than return true cos it will be a palindrome
*   3. Initialize a stack, in the first half sttore the first half of string
*   4. Iterate through the second half of the modified string and compare each character with the top element of the stack.
* If they are not equal, return false, as it is not a palindrome. Otherwise, continue with the next character.
*   5. Also if string length is odd, skip the middle character
*  6. If the entire second half of the string has been compared and no mismatches are found, return true, as the string is a palindrome.
* */
public class PlaindromString {
    public static void main(String[] args) {
        String str =  "A man, a plan, a canal: Panama";
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(isPalindrome(str));



    }

    static boolean isPalindrome(String s) {
        int len = s.length();
        if(len < 2)
            return  true;

        Stack<Character> stack = new Stack<>();
        int index = 0;
        while(index < len / 2){
            stack.push(s.charAt(index));
            index++;
        }

        if(len % 2 == 1)
            index++;

        while(index< len){
            if(stack.isEmpty())
                return false;

            char temp = stack.pop();
            if(temp != s.charAt(index)){
                return false;
            }
            else{
                index++;
            }

        }
            return true;
    }
}
