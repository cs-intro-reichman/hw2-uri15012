// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	  String word = args[0];
          int number = Integer.parseInt(args[1]);

          word = word.toUpperCase();
          String specialCases = "AEFHILMNORSX";
          String AN;

                // pegar tamanho da palavra
          for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < specialCases.length(); j++) {
                        if (word.charAt(i) == specialCases.charAt(j)) { // ve uma por uma
                                AN = "an";
                                break;
                                } else {
                                AN = "a";      
                                }
                                System.out.println("Give me " + AN + word.charAt(i) + ":" + word.charAt (i) + "!");
                        }
                }
                        System.out.println("what does that spell?");
                

                  for (int k = 0; k < number; k++) { // essa faz com que as palavras se repitam no final
                                System.out.println(word + "!!!");
                        }
                

        }
}
                
                
                
              