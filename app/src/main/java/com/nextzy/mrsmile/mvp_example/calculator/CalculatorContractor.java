package com.nextzy.mrsmile.mvp_example.calculator;

import com.nextzy.mrsmile.mvp_example.common.BasePresenter;
import com.nextzy.mrsmile.mvp_example.common.BaseView;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
public class CalculatorContractor {

    interface Presenter extends BasePresenter {

        int plusValue(int x, int y);

        int minusValue(int x, int y);

        int multiplyValue(int x, int y);

        int divideValue(int x, int y);
    }

    interface View extends BaseView<Presenter> {

    }
}
