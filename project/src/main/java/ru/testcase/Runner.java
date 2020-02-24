package ru.testcase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Entry Point of program.
 * Read data, make operations
 * with it and output the result
 * @author Egor Geraskin
 * @since 1.2
 */
public class Runner {
    /**
     * Interact part of the program.
     * Create all necessary objects
     * and output the result
     * @param args
     * @throws IOException if input data is incorrect
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DataInput dataInput = new DataInput(reader);
        Calculator calculator = new Calculator();
        NumeralTransformer transformer = new NumeralTransformer();

    }

    public int resultOfOperation(Calculator calculator, int firstNumber, int secondNumber, char operation) {
        return 0;
    }
}
