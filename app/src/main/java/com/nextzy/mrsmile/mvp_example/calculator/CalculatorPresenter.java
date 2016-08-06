package com.nextzy.mrsmile.mvp_example.calculator;

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

    @Override
    public CalculatorPresenter createPresenter(CalculatorContractor.View view) {
        return new CalculatorPresenter(view);
    }

    @Override
    public int plusValue(int x, int y) {
        return 0;
    }

    @Override
    public int minusValue(int x, int y) {
        return 0;
    }

    @Override
    public int multiplyValue(int x, int y) {
        return 0;
    }

    @Override
    public int divideValue(int x, int y) {
        return 0;
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }


}
