public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 25, square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        if (squareStr.endsWith(numStr)) System.out.println(num + " is an Automorphic Number.");
        else System.out.println(num + " is not an Automorphic Number.");
    }
}