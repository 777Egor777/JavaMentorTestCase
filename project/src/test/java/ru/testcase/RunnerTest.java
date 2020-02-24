package ru.testcase;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class RunnerTest {

    @Test
    public void resultOfOperation() throws IOException {
        Runner runner = new Runner();
        Calculator calculator = new Calculator();
        Assert.assertEquals(63, runner.resultOfOperation(calculator, 7, 9, '*'));
    }
}