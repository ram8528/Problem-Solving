// printing all subsets of a string(power set elements)

public class Backtrack_Subsets {

    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + " ");
            }
            return;
        }
        // Recursive Step
        // Choice for yes
        findSubsets(str, ans + str.charAt(i), i + 1);

        // choice for no
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
