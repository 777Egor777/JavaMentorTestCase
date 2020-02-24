package ru.testcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Input and parse data
 * @author Egor Geraskin
 * @version 1.1, 24.02.2020
 */
public class DataInput {
    /**
     * Whole input string
     */
    private String dataString;

    /**
     * first integer number
     * from 1 to 10
     */
    private int firstArgument;

    /**
     * second integer number
     * from 1 to 10
     */
    private int secondArgument;

    /**
     * one if this operations:
     * +, -, *, /
     */
    private char operation;


    /**
     * Getter for firstArgument
     * @return this.firstArgument
     */
    public int getFirstArgument() {
        return this.firstArgument;
    }

    /**
     * Getter for secondArgument
     * @return this.secondArgument
     */
    public int getSecondArgument() {
        return this.secondArgument;
    }

    /**
     * Getter for operation
     * @return this.operation
     */
    public char getOperation() {
        return this.operation;
    }

    /**
     * Constructor.
     * Input dataString and start
     * parse process
     * @param reader - object that helps to read dataString
     * @throws IOException - if input is incorrect
     */
    public DataInput(BufferedReader reader) throws IOException {
        this.dataString = reader.readLine();
        this.parseData();
    }

    /**
     * Parse dataString
     * @throws IOException
     */
    private void parseData() throws IOException {
        this.dataString = this.dataString.trim();
        String[] dataStringParts = this.dataString.split(" ");
        if (dataStringParts.length != 3) {
            throw new IOException("Incorrect input string");
        }

        if (this.isArabicNumeral(dataStringParts[0]) &&
            this.isArabicNumeral(dataStringParts[2])) {
            this.firstArgument = Integer.parseInt(dataStringParts[0]);
            this.secondArgument = Integer.parseInt(dataStringParts[2]);
        } else if (this.isRomanNumeral(dataStringParts[0]) &&
                   this.isRomanNumeral(dataStringParts[2])) {

        } else {
            throw new IOException("Numbers must be both Rome or both Arabic, from 1 to 10");
        }
    }
}
