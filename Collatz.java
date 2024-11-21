// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int n = 0;
		int counter = 1;
			for (int i = 1; i < N + 1; i++){
				counter = 1;
				n = i;
				String line = String.valueOf (n) +" ";
				if (n==1) {
					n=4;
					line = line + (String.valueOf(n) + " ");
					counter++;

					
				}
				while (n!=1){
					if (n%2==0){
						n = n / 2;
							line = line + (String.valueOf(n)+ " ");

						} else {
							n = (n*3)+1;
							line = line + ((String.valueOf(n) + " "));
						}
						counter++;}
						if (mode.equals("v"))
						{
							line = line + ("(" + counter +")");
							System.out.println(line);
							System.lineSeparator();

						}

				
						
					}
					System.out.println("Every one of the first " + N + "hailstone sequences reached 1.");

				}
			}


		
	
