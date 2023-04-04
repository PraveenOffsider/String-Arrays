package week2;

public class oddIndex {
    public static void main (String[] args){
        String test = "changeme";
        char [] cha = test.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            if(i%2!=0){
                cha[i]= Character.toUpperCase(cha[i]);

            }
        }
        System.out.println("The modified String is:" + new String(cha));
    }

}
