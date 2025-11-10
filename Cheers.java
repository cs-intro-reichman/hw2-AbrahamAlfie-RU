//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int nTimes = Integer.parseInt(args[1]);
                String anLetters = "AEFHILMNORSX";

                for (int i = 0; i < word.length(); i++) {
                        char currentLetter = word.charAt(i);
                        int indexOfAn = anLetters.indexOf(currentLetter);
                        String aOrAn = (indexOfAn != -1) ? "an" : "a ";
                        System.out.println("Give me " + aOrAn + " " + currentLetter + ": " + currentLetter + "!");
                }

                for (int i = 0; i < nTimes; i++) {
                        System.out.println(word + "!!!");
                }
        }
}
