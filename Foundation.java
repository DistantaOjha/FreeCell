
public class Foundation extends CardStack{


	public Foundation(){
	}

	public boolean 	canPlayFrom() throws IllegalPlayException{
		throw new IllegalPlayException("That card stack cannot be played from.");
	}


	public boolean 	playTo(Card card) throws IllegalPlayException
	{
		try {
			//System.out.println("Hi Foundation");
			if(!isEmpty()){
				if (card.getSuit()==getTopCard().getSuit()) {
					if(card.getRank()-1== getTopCard().getRank()){
						addCard(card);
						return true;
					}
					else
						throw new IllegalPlayException("Plays to a foundation must have the next increasing rank.");
				}
				else
					throw new IllegalPlayException("Plays to a foundation must match suit.");
			}
			else {
				if (card.getRank()==0){
					addCard(card);
					return true;
				}
				else
					throw new IllegalPlayException("The first foundation card must be an Ace.");
		}
	}
	catch (NullPointerException e) {
		throw new NullPointerException(e.getMessage());
	}

}

}
