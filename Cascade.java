
public class Cascade extends CardStack{


	public Cascade() {

	}
	//1 to 4cell , 5-8 foundations, and 9-16 cascades
	public boolean playTo(Card card) throws IllegalPlayException{
		//System.out.println("Hi Cascade");
		if(card==null){
			NullPointerException e= new NullPointerException(); 
			throw new NullPointerException(e.getMessage());
		}
		try {
		if(!isEmpty()){
			int suit1=getTopCard().getSuit();
			int suit2 = card.getSuit();
			if(( Card.suitIsRed[suit1] || Card.suitIsRed[suit2] ) && ! ( Card.suitIsRed[suit1] && Card.suitIsRed[suit2] ) ){
			
				
				if (getTopCard().getRank()== card.getRank()+1){
					addCard(card);
					return true;
				}	
				else{
					throw new IllegalPlayException("Plays to a cascade must have the next decreasing rank.");
					
				}
			}
			else{
				throw new IllegalPlayException("Plays to a cascade must alternate in suit color.");
				
			}
		}
		else
		{
			addCard(card);
			return true;
		}
		}
		catch (NullPointerException e) {
			throw new NullPointerException(e.getMessage());
		}
	}
}
