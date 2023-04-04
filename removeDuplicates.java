package week2;

public class removeDuplicate {
    public static void main(String[] args) {
        //*
        //* Pseudo code

        //* a) Use the declared String text as input
        String text = "We learn java basics as part of java sessions in java week1";
        //* b) Initialize an integer variable as count

        //* c) Split the String into array and iterate over it
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            int total = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    total++;

                }
            }
            if (total > 1) {
                words[i] = "";
            }}
            StringBuilder resultbinder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (!words[i].isEmpty()) {
                    resultbinder.append(words[i]).append(" ");
                }

            }
            String result = resultbinder.toString().trim();
            System.out.println("Result: " + result);

        }
    }



