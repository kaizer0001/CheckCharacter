
public class CheckCharacter {

    public static String checkFirstChar(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {
            return "upper";
        } else if (Character.isLowerCase(c)) {
            return "lower";
        } else if (Character.isDigit(c)) {
            return "digit";
        } else {
            return "other";
        }
    }

	public static void main(String[] args) {
	      System.out.println(checkFirstChar("Ahmad"));
	      System.out.println(checkFirstChar("java"));
	      System.out.println(checkFirstChar("000"));
	      System.out.println(checkFirstChar("+"));
	}

}
