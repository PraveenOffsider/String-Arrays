package week2;

public class ReverseEvenWords {

        public static void main(String[] args) {

            // Declare the input String
            String test = "I am a software tester";

            // Split the words and have it in an array
            String[] words = test.split(" ");

            // Traverse through each word (using loop)
            for (int i = 0; i < words.length; i++) {

                // Find the even index within the loop (use mod operator)
                if (i % 2 == 0) {

                    // Split the even position words and have it in an array
                    char[] charArray = words[i].toCharArray();

                    // Concatenate space at the beginning of even position word
                    System.out.print(" ");

                    // Print the even position words in reverse order using another loop (nested loop)
                    for (int j = charArray.length - 1; j >= 0; j--) {

                        // Convert words to character array if the position is even else print the word as it is
                        System.out.print(charArray[j]);
                    }
                }
                else {
                    // Print the odd position words as it is
                    System.out.print(words[i]);

                }
                if (i != words.length - 1) {
                        System.out.print(" ");
                    }
                }
            }

        }

