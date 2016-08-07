package com.nextzy.mrsmile.mvp_example.calculator;

import android.view.View;

import com.nextzy.mrsmile.mvp_example.common.BasePresenter;
import com.nextzy.mrsmile.mvp_example.common.BaseView;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
public class CalculatorContractor {

    interface Presenter extends BasePresenter {

        void viewClick(android.view.View view);

        int plusValue(int x, int y);

        int minusValue(int x, int y);

        int multiplyValue(int x, int y);

        int divideValue(int x, int y);
    }

    interface View extends BaseView<Presenter> {

        String getTextDisplay();

        void setTextDisplay(String text);
    }
}
