public class DemoCard {

    public static void main(String[] args) {
        Card[] cards = new Card[10];
        cards[0] = new Card(4,"red");
        cards[1] = new Card(6,"yellow");
        cards[2] = new Card(7,"blue");
        cards[3] = new Card(9,"red");
        cards[4] = new Card(1,"green");
        cards[5] = new Card(3,"blue");
        cards[6] = new Card(2,"yellow");
        cards[7] = new Card(5,"red");
        cards[8] = new Card(6,"yellow");
        cards[9] = new Card(4,"red");

        CardStack stack = new CardStack(cards);

        stack.push(cards[5]);
        stack.push(cards[9]);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

    }
}
