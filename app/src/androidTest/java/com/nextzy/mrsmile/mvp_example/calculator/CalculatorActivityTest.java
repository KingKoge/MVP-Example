package com.nextzy.mrsmile.mvp_example.calculator;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.nextzy.mrsmile.mvp_example.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by nextzy on 8/6/2016 AD.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class CalculatorActivityTest {

    @Rule
    public ActivityTestRule<CalculatorActivity> activityTestRule = new ActivityTestRule<>(CalculatorActivity.class);

    @Before
    public void setUp() {

    }

    @Test
    public void isVisibleButtonZero() {
        onView(withId(R.id.btn_zero)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonOne() {
        onView(withId(R.id.btn_one)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonTwo() {
        onView(withId(R.id.btn_two)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonThere() {
        onView(withId(R.id.btn_there)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonFour() {
        onView(withId(R.id.btn_four)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonFive() {
        onView(withId(R.id.btn_five)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonSix() {
        onView(withId(R.id.btn_six)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonSeven() {
        onView(withId(R.id.btn_seven)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonEight() {
        onView(withId(R.id.btn_eight)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonNine() {
        onView(withId(R.id.btn_nine)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonClear() {
        onView(withId(R.id.btn_clear)).check(matches(isDisplayed()));
    }

    @Test
    public void isVisibleButtonDot() {
        onView(withId(R.id.btn_dot)).check(matches(isDisplayed()));
    }

}