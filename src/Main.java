public class Main {

    public static void main(String[] args) {
      boolean hasLetter = charSearch("Welcome to the ultimate Git-course!", 'e');

        System.out.println(hasLetter);
    }

    public static boolean charSearch(String s, char x) {
        for (char c : s.toCharArray()) {
            if (c == x) return true;
        }
        return false;
    }
}
