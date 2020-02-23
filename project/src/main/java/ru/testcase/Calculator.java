package ru.testcase;

/**
 * Class implements simple
 * calculator, that could
 * perform 4 base math operations:
 * summation(+), subtraction(-),
 * multiplication(*) and division(/)
 * with two integer arguments
 * @author Egor Geraskin
 * @version 1.0, 14.01.2020
 */
public class Calculator {
    public static void main(String[] args) {}

    /**
     * Summation of two integer numbers
     * @since 1.1
     * @param firstNumber
     * @param secondNumber
     * @return summation of parameters
     */
    int summation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Subtraction of two integer numbers
     * @since 1.1
     * @param firstNumber
     * @param secondNumber
     * @return subtraction of parameters
     */
    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Multiplication of two integer numbers
     * @since 1.1
     * @param firstNumber
     * @param secondNumber
     * @return result of multiplication
     */
    int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Division of two integer numbers
     * @since 1.1
     * @param firstNumber
     * @param secondNumber
     * @return result of division
     */
    double division(int firstNumber, int secondNumber) {
        return (double)firstNumber / secondNumber;
    }
}