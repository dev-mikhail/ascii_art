package edu.nyu.cs9053.homework3;

/**
 * User: blangel
 */
public class Grayscaler {

    /**
     * Turns {@code pixel} into gray-scale
     * @implNote {@code pixel} is an RGB value where blue is the first 8 bits, green is the second 8 bits and red is the third 8 bits
     * @implNote to gray-scale an RGB use this formula {@literal 0.21 * red + 0.72 * green + 0.07 * blue}
     * @param pixel to gray-scale
     * @return the gray-scaled value
     */
    public double grayScale(int pixel) {
	// TODO - implement this
        int red = pixel & 0xFF000000;
        int green = pixel & 0x00FF0000;
        int blue = pixel & 0x0000FF00;
        return 0.21 * red + 0.72 * gree + 0.07 * blue;
    }

}
