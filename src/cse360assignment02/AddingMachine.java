package cse360assignment02;

/**
 * This class is a basic calculator. It performs add and subtract functions and displays the order in which they happen
 */
public class AddingMachine {
    private int total;
    private String result = "0 ";

    /**
     * Constructor for the AddingMachine class
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    /**
     * Returns the current total
     * @return current total for the AddingMachine
     */
    public int getTotal () {
        return total;
    }

    /**
     * Adds value to the total
     * @param value value that gets added to the total
     */
    public void add (int value) {
        total = total + value;
        result+= "+ " + value + " ";
    }

    /**
     * Subtracts the value from the total
     * @param value value that gets subtracted from the total
     */
    public void subtract (int value) {
        total = total - value;
        result+= "- " + value + " ";
    }

    /**
     * Returns a string showing all the operations that have happened to the total
     * @return returns result, the string that shows all the operations that have happened
     */
    public String toString () {
        return result;
    }

    /**
     * Resets the total and clears the string result
     */
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
