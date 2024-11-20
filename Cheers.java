// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	  String word = args[0]; // eh oq eu recebo do usuario 
          int number = Integer.parseInt(args[1]); // recebo do usuario 

          word = word.toUpperCase();
          String specialCases = "AEFHILMNORSX"; // isso eh dado 
          String AN = ""; // so criei uma string p poder usar

                // iterate over each chracter in the input word 
          for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < specialCases.length(); j++) { // check the special case 
                        if (word.charAt(i) == specialCases.charAt(j)) { // analisa se uma eh igual a outra
                                AN = "an ";
                                break;
                                } else {
                                AN = "a  ";      
                                }
                        }

                        
                                System.out.println("Give me " + AN + word.charAt(i) + ": " + word.charAt (i) + "!");
                        
                }
                        System.out.println("What does that spell?");
                

                  for (int k = 0; k < number; k++) { // essa faz com que as palavras se repitam no final
                                System.out.println(word + "!!!");
                        }
                

                }
}
                
                
                
              