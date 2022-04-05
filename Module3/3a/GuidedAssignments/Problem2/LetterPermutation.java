package Problem2;

public class LetterPermutation {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        permutation("", num);
   }

   public static void permutation(String str, int remaining){
        if (remaining == 1) {
                System.out.println(str + "L");
                System.out.println(str + "R");
        } else {
                permutation(str + "L", remaining - 1);
                permutation(str + "R", remaining - 1);
        }
   }
}
