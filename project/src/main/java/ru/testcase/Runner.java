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

        int result = new Runner().resultOfOperation(calculator,
                                                    dataInput.getFirstArgument(),
                                                    dataInput.getSecondArgument(),
                                                    dataInput.getOperation());
        new Runner().outputResult(result, dataInput.isRomeNumeral());
    }

    /**
     * Make operation with object
     * calculator and numbers
     * firstNumber, secondNumber
     * @param calculator
     * @param firstNumber
     * @param secondNumber
     * @param operation
     * @return result of the operation
     */
    public int resultOfOperation(Calculator calculator, int firstNumber, int secondNumber, char operation) throws IOException {
        int result = 0;
        switch (operation) {
            case '+': result = calculator.summation(firstNumber, secondNumber);
                      break;
            case '-': result = calculator.subtraction(firstNumber, secondNumber);
                      break;
            case '*': result = calculator.multiplication(firstNumber, secondNumber);
                      break;
            case '/': result = calculator.division(firstNumber, secondNumber);
                      break;
        }

        return result;
    }

    /**
     * Output the result in
     * correct format
     * @param result - result as Arabic numeral
     * @param isRomeNumeral false - we should output this form
     *                      true - we must transfer number
     *                             to Rome numeral and then
     *                             output it
     */
    public void outputResult(int result, boolean isRomeNumeral) {
        if (!isRomeNumeral) {
            System.out.println(result);
        } else {
            NumeralTransformer transformer = new NumeralTransformer();
            System.out.println(transformer.changeArabicToRome(result));
        }
    }
}
