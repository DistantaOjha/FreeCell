
import java.io.BufferedInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Freecell {

	public static void main(java.lang.String[] args) throws IllegalPlayException {
		//System.out.println("Hi");
		Scanner input= new Scanner(new BufferedInputStream((System.in)));
		FreecellGame start = new FreecellGame(2);
		int move1 = 0, move2=0;
		System.out.println(start.toString());
		System.out.print("Please enter source and destination card stacks, or '-1' to quit: ");
		do {
			while(!start.isGameOver() && input.hasNext()) {
				try {
					 move1= input.nextInt();
					 move2= input.nextInt();
					if(move1==-1 || move2==-1){
						System.out.print("You quit");
						System.exit(1);
					}
					start.play(move1, move2);
				}
				
				catch(InputMismatchException e){
					input.next();
					System.out.print("Source and destination card stacks must be entered as integers (1-16).");
				}
				
				catch(IllegalPlayException f) {
					System.out.print("Illegal play: " + f.getMessage()); 
				}
				finally {
					System.out.println(start.toString());
					System.out.print("Please enter source and destination card stacks, or '-1' to quit: ");
				}
				
			} 
		} while (!start.isGameOver());
		System.out.println("\nThe game ended");
		if(start.isGameOver())
			System.out.println("You win!");
		input.close();

	}


	public void play() throws IllegalPlayException{
		long random =(long) Math.random();
		new FreecellGame(random);


	}


	public void 	play(long seed) throws IllegalPlayException{
		new FreecellGame(seed);
	}



}
