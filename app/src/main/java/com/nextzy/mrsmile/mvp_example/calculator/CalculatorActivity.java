package com.nextzy.mrsmile.mvp_example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nextzy.mrsmile.mvp_example.R;

public class CalculatorActivity extends AppCompatActivity implements CalculatorContractor.View {

    private CalculatorContractor.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        presenter = CalculatorPresenter.createPresenter(this);
    }

    @Override
    public void setPresenter(CalculatorContractor.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }
}
