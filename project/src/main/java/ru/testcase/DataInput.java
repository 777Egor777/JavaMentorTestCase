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
     * one of this operations:
     * +, -, *, /
     */
    private char operation;

    /**
     * true - if arguments are Rome numerals
     * false - otherwise
     */
    private boolean isRomeNumeral;

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
     * Getter for isRomeNumeral
     * @return this.isRomeNumeral
     */
    public boolean isRomeNumeral() {
        return this.isRomeNumeral;
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
     * @throws IOException if data is incorrect
     */
    private void parseData() throws IOException {
        String[] dataStringParts = this.dataString.split(" ");
        if (dataStringParts.length != 3) {
            throw new IOException("Incorrect input string");
        }
        this.parseNumbers(dataStringParts[0], dataStringParts[2]);
        this.parseOperation(dataStringParts[1]);
    }

    /**
     * Parse numbers and checks
     * if they are correct.
     * Numbers can be Roman or Arabic.
     * But they should be both Roman
     * or both Arabic
     * @param firstNumberLine line, contains first number-argument
     * @param secondNumberLine line contains second number - argument
     * @throws IOException if numbers
     *         are incorrect
     */
    private void parseNumbers(String firstNumberLine, String secondNumberLine) throws IOException{

    }

    /**
     * Parse operation and checks
     * if she is correct
     * Operation can be:
     * '+', '-', '*' or '/'
     * @param operationLine line contains operation
     * @throws IOException if operation is incorrect
     */
    private void parseOperation(String operationLine) throws IOException {

    }
}
