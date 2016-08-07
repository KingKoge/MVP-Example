package com.nextzy.mrsmile.mvp_example.calculator;

import android.view.View;
import android.widget.Button;

import com.nextzy.mrsmile.mvp_example.R;

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

        Button button;

        if (view instanceof Button)
            button = (Button) view;
        else
            return;

        int id = button.getId();

        switch (id) {
            case R.id.btn_clear:
                this.view.setTextDisplay("0.00");
                break;
            case R.id.btn_operator_equals:
                break;
            default:
                String displayText = this.view.getTextDisplay();
                String text = button.getText().toString();

                if (displayText.equalsIgnoreCase("0.00")) {
                    this.view.setTextDisplay(text);
                } else {
                    this.view.setTextDisplay(displayText + text);
                }
                break;
        }
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
