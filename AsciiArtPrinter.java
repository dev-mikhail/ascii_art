package edu.nyu.cs9053.homework3;

/**
 * User: blangel
 */
public class AsciiArtPrinter {

    /**
     * @implNote should only print values within {@code asciiArt} and nothing else within this method
     * @param asciiArt to print
     */
    public void print(char[][] asciiArt) {
	// TODO - implement this
    }

    protected void clearScreen() {
        System.out.printf("\u001B[51;1H");
    }

}
