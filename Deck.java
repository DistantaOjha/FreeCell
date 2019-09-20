import java.util.Random;

public class Deck extends CardStack{
	 private static Random random = new Random(0);
	 
	 public Deck(long seed){
		 //System.out.println("Hi3");
		 for( Card c : Card.allCards){
			 addCard(c);
		
		 }
		random.setSeed(seed);
		for(int i= stack.size()-1; i>0; i--){
			int j= random.nextInt(i+1);
			Card c= stack.get(i);
			stack.set(i, stack.get(j));
			stack.set(j, c);
		}
	 }
	 @Override
	 public boolean canPlayFrom() throws IllegalPlayException{
		 
		 throw new IllegalPlayException("That card stack cannot be played from.");
	 }
	 
	 public boolean playTo(Card c) throws IllegalPlayException{
		 if (c==null){
			 NullPointerException e= new NullPointerException();
			 throw new NullPointerException(e.getMessage());
		 }
		 throw new IllegalPlayException("Illegal stack number. Stack are numbered 1-16");
		
	 }
	 
	 
}
