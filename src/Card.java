public class Card {
    public int getValue() {
        return value;
    }
    public String getColour() {
        return colour;
    }

    public Card(int value, String colour) {
        if(value >0 && value <10)
        {
            this.value = value;
        }
        else{
            System.out.println("Fehler, ungültige Zahl!");
        }
        if(colour .equals("blue") || colour .equals("red") || colour .equals("green") || colour .equals("yellow"))
        { this.colour = colour;}
        else{
            System.out.println("Fehler, ungültige Farbe!");
        }

    }

    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }

    private int value;
    private String colour;





}
