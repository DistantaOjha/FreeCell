
import java.util.EmptyStackException;
import java.util.Stack;

public class CardStack {

	protected Stack<Card> stack = new Stack<Card>();
	
	
	public void 	addCard(Card card){
		stack.push(card);
	}
	
	
	public boolean 	canPlayFrom() throws IllegalPlayException{
		if(stack.isEmpty())
			throw new IllegalPlayException("You cannot play from an empty stack.");
		else
			return true;
	}
	
	
	
	public Card getTopCard() throws IllegalPlayException{
		try {
			return stack.peek();  
		}
		catch(EmptyStackException e) {
			throw new EmptyStackException();
		}
		
		
	}
	
	
	
	public boolean 	isEmpty(){
		return stack.empty();		
	}
	
	
	
	public boolean 	playTo(Card card) throws IllegalPlayException{
		if(card!=null){
		addCard(card);
		return true;
		} 
		NullPointerException e= new NullPointerException(); 
		throw new NullPointerException(e.getMessage());		
  }
  
	
	
	
	public boolean 	playTo(CardStack otherStack) throws IllegalPlayException{
		if(!otherStack.canPlayFrom()){
			NullPointerException e= new NullPointerException();
			throw new NullPointerException(e.getMessage());
		}
		boolean legalPlay= playTo(otherStack.getTopCard());
		if (legalPlay){
			otherStack.removeTopCard();
			return legalPlay;
		}
		else{
			NullPointerException e= new NullPointerException();
			throw new NullPointerException(e.getMessage());
		}
			
				
		
	}
	
	
	
	
	public Card removeTopCard() throws IllegalPlayException{
		try {
		return  stack.pop();
		}
		catch(EmptyStackException e) {
			throw new EmptyStackException();
		}
		
	}
	
	
	
	public int 	size(){
		return stack.size();		
	}
	
	
	
	
	public Card[] 	toArray(){
	 return stack.toArray(new Card[stack.size()]);	
	}
	
	
	
	
	public String toString(){
		String s= stack.toString();
		return s.substring(1,s.length()-1);

	}
}

