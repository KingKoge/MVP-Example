package com.nextzy.mrsmile.mvp_example.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
public class CalculatorPresenterTest {

    private CalculatorPresenter presenter;

    @Before
    public void setUp() {
        presenter = new CalculatorPresenter();
    }

    @Test
    public void checkPlusValueEqualsOne() {
        int value = presenter.plusValue(0, 1);
        Assert.assertEquals(value, 1);
    }

    @Test
    public void checkMinusValueEqualsOne() {
        int value = presenter.minusValue(2, 1);
        Assert.assertEquals(value, 1);
    }

    @Test
    public void checkMultiplyValueEqualsOne() {
        int value = presenter.multiplyValue(1, 1);
        Assert.assertEquals(value, 1);
    }

    @Test
    public void checkDivideValueEqualsOne() {
        int value = presenter.divideValue(1, 1);
        Assert.assertEquals(value, 1);
    }
}