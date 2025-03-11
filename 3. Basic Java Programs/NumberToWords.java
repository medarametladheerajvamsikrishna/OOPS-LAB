public class NumberToWords {
    public static void main(String[] args) {
        int num = 7;
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (num >= 0 && num <= 9) System.out.println("Number in words: " + words[num]);
        else System.out.println("Number out of range");
    }
}