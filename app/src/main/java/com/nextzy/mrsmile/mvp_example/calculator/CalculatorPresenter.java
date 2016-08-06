package com.nextzy.mrsmile.mvp_example.calculator;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
public class CalculatorPresenter implements CalculatorContractor.Presenter {

    private CalculatorContractor.View view;

    private CalculatorPresenter(CalculatorContractor.View view) {
        this.view = view;
    }

    @Override
    public CalculatorPresenter createPresenter(CalculatorContractor.View view) {
        return new CalculatorPresenter(view);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }


}