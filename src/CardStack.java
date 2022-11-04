public class CardStack {

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
    }

    public Card[] cards;
    private int counter;

    public void push(Card newCard){
        counter++;
        //System.out.println("counter" + counter);
        if(counter < 11) {
            cards[counter] = newCard;

        }
        else{
            System.out.println("Array voll!!");
        }
    }

    public Card pop(){
        counter--;

        return cards[counter + 1];
    }
}
