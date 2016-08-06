package com.nextzy.mrsmile.mvp_example.calculator;

import com.nextzy.mrsmile.mvp_example.common.BasePresenter;
import com.nextzy.mrsmile.mvp_example.common.BaseView;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
public class CalculatorContractor {

    interface Presenter extends BasePresenter {

        CalculatorPresenter createPresenter(CalculatorContractor.View view);
    }

    interface View extends BaseView<Presenter> {

    }
}
