
public class FreecellGame {
	
	private CardStack[] stacks = new CardStack[17];
	
	public FreecellGame(long seed) throws IllegalPlayException{
		
		stacks [0] = new Deck(seed);
		
		for( int i=1; i< stacks.length; i++){  //polymorphism

			stacks[i]= new CardStack();
			if (i<=4 && i>=1){
				stacks[i]= new Cell();
			}
			else if (i<=8 && i>=5){
				stacks[i]= new Foundation();
			}
			else if (i<=16 && i>8){
				stacks[i]= new Cascade();
			}
		}
		
	//Deal Deck
		int i=9;
		while (!stacks[0].isEmpty()){
				stacks[i++].addCard(stacks[0].getTopCard());
				stacks[0].removeTopCard();
			if (i>16)
				i=9;	
		}
		
		
		
	}
		
	
	public boolean play( int srcStackNum, int destStackNum) throws IllegalPlayException {	
			if(destStackNum==srcStackNum)
				throw new IllegalPlayException("Source and destination stacks must be different.");
			
			if((destStackNum<=0||srcStackNum<=0) ||(destStackNum>16||srcStackNum>16)) 
				throw new IllegalPlayException("Illegal stack number. Stacks are numbered 1-16.");
			
			return stacks[destStackNum].playTo(stacks[srcStackNum]);
		}
	
	public Card[] getStack(int stackNum){
		Card[] to_return= stacks[stackNum].toArray();
		return  to_return;
	}
	
	boolean isGameOver(){
		for (int i=9; i<=16;i++){
		boolean check= stacks[i].isEmpty();
			if(!check)
				return false;
		}
		return true;
	}
	
	
	public String toString() {
		StringBuilder s1= new StringBuilder();
		s1.append("Cells:");
		for(int i=1; i<=16; i++ ){
			
			s1.append("\n");
			if(i==5)
				s1.append("Foundations:\n");
			if(i==9)
				s1.append("Cascades:\n");
			if (i<10)
				s1.append(" ");
			s1.append(Integer.toString(i));
			s1.append(": ");
			s1.append(stacks[i]);			
		}
		return s1.toString();
	}
	
	
}
