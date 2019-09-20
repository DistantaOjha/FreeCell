# FreeCell
Text-based FreeCell game in Object Oriented Design.
Card: Represents cards in a standard card deck. The static initializer block constructor constructs all the cards in a Deck.
CardStack: Represents a stack of cards.
Cascade: Eight card stacks the user works on.
Cell: Four Empty Spaces usually seen on the top left part of the screen. Each Cell stores only one card and it acts as an extra space so that the user can move around the card more freely. 
Deck: Represents a Deck of card.
Foundation: Four empty spaces usually seen on the top right part of the screen. Each Foundation stores cards of one suit and in increasing order A-2-3..-K. The goal of this game is to get all the cards into the foundation.
FreeCell: Main Driver Class.
FreeCell Game: Class the connects all the other components of the game. The Driver class works on drives class.
IllegalPlayException: Created new exception that gets thrown whenever an illegal move is detected.
