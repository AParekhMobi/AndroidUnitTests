package com.mobiquity.androidunittests.calculator.input.operator;

import com.mobiquity.androidunittests.R;

public class MultiplicationOperator extends Operator {

    public MultiplicationOperator() {
        super(R.string.multiply_op);
    }

    @Override
    public double execute(double param1, double param2) {
        return multiply(param1, param2);
    }

    @Override
    public int getPrecedence() {
        return Precedence.MULTIPLICATION_PRECEDENCE.getValue();
    }

    @Override
    public boolean isLeftAssociative() {
        return true;
    }


    private double multiply(double param1, double param2) {
        return param1 * param2;
    }
}
