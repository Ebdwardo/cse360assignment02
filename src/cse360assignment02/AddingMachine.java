package cse360assignment02;

public class AddingMachine {
    private int total;
    private String result = "0 ";

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total = total + value;
        result+= "+ " + value + " ";
    }

    public void subtract (int value) {
        total = total - value;
        result+= "- " + value + " ";
    }

    public String toString () {
        return result;
    }

    public void clear() {
        total = 0;
        result = "0 ";
    }

    public static void main(String[] args) {
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add (4);
        myCalculator.subtract (2);
        myCalculator.add(5);
        System.out.println(myCalculator.toString());
    }
}
