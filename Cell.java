
public class Cell extends CardStack {

	public Cell(){
	}

	public boolean playTo(Card card) throws IllegalPlayException{
		//System.out.println("Hi Cell");
			if(card==null){
				NullPointerException e= new NullPointerException(); 
				throw new NullPointerException(e.getMessage());
			}
		
			if (isEmpty()){
				addCard(card);
				return true;
			}
			throw new IllegalPlayException("Cells may only contain a single card.");
		}
		
}
