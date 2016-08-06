package com.nextzy.mrsmile.mvp_example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nextzy.mrsmile.mvp_example.R;

public class CalculatorActivity extends AppCompatActivity implements CalculatorContractor.View, View.OnClickListener {

    private CalculatorContractor.Presenter presenter;

    private Button btnZero;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThere;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;

    private Button btnOperatorPlus;
    private Button btnOperatorMinus;
    private Button btnOperatorDivide;
    private Button btnOperatorMultiply;
    private Button btnOperatorEquals;

    private Button btnDot;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        createPresenter();
        bindView();
        setDefaultView();
    }

    private void createPresenter() {
        presenter = CalculatorPresenter.createPresenter(this);
    }

    private void bindView() {
        btnZero = (Button) findViewById(R.id.btn_zero);
        btnOne = (Button) findViewById(R.id.btn_one);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnThere = (Button) findViewById(R.id.btn_there);
        btnFour = (Button) findViewById(R.id.btn_four);
        btnFive = (Button) findViewById(R.id.btn_five);
        btnSix = (Button) findViewById(R.id.btn_six);
        btnSeven = (Button) findViewById(R.id.btn_seven);
        btnEight = (Button) findViewById(R.id.btn_eight);
        btnNine = (Button) findViewById(R.id.btn_nine);

        btnOperatorPlus = (Button) findViewById(R.id.btn_operator_plus);
        btnOperatorMinus = (Button) findViewById(R.id.btn_operator_minus);
        btnOperatorDivide = (Button) findViewById(R.id.btn_operator_divide);
        btnOperatorMultiply = (Button) findViewById(R.id.btn_operator_multiply);
        btnOperatorEquals = (Button) findViewById(R.id.btn_operator_equals);

        btnDot = (Button) findViewById(R.id.btn_dot);
        btnClear = (Button) findViewById(R.id.btn_clear);
    }

    private void setDefaultView() {
        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThere.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);

        btnOperatorPlus.setOnClickListener(this);
        btnOperatorMinus.setOnClickListener(this);
        btnOperatorDivide.setOnClickListener(this);
        btnOperatorMultiply.setOnClickListener(this);
        btnOperatorEquals.setOnClickListener(this);

        btnDot.setOnClickListener(this);
        btnClear.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        presenter.viewClick(v);
    }
}
