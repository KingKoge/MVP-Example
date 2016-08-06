package com.nextzy.mrsmile.mvp_example.calculator;

import android.view.View;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
public class CalculatorPresenter implements CalculatorContractor.Presenter {

    private CalculatorContractor.View view;

    protected CalculatorPresenter() {

    }

    private CalculatorPresenter(CalculatorContractor.View view) {
        this.view = view;
    }

    public static CalculatorPresenter createPresenter(CalculatorContractor.View view) {
        return new CalculatorPresenter(view);
    }

    @Override
    public void viewClick(View view) {

    }

    @Override
    public int plusValue(int x, int y) {
        return x + y;
    }

    @Override
    public int minusValue(int x, int y) {
        return x - y;
    }

    @Override
    public int multiplyValue(int x, int y) {
        return x * y;
    }

    @Override
    public int divideValue(int x, int y) {
        return x / y;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}
