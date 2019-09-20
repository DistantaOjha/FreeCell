
public class Card {
		private int rank;
		private int suit;
		public static Card[] allCards;
		public static java.lang.String[] rankNames={"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		public static boolean[] 	suitIsRed= {false, true, true, false};
		public static String[] 	suitNames= {"C", "d", "h", "S"};
		
		static {
			//static initializer block- constructor for class
			allCards=new Card[rankNames.length*suitNames.length];
			int i=0;
			for(int s=0; s <suitNames.length ; s++)
				for (int r=0; r<rankNames.length; r++){
					if (i<52)
						allCards[i++]= new Card(r,s);
				}
		}
		
		
		public Card(int rank, int suit) {
			this.rank = rank;
			this.suit = suit;
		}



		public int getRank() {
			return rank;
		}



		public int getSuit() {
			return suit;
		}



		public String toString() {
			return rankNames[rank]+ suitNames[suit];
		}
		
		


}
