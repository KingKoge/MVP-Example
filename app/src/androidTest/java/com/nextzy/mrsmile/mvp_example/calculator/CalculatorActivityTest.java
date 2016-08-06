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
import static android.support.test.espresso.matcher.ViewMatchers.withText;

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
        onView(withId(R.id.btn_zero)).check(matches(withText("0")));
    }

    @Test
    public void isVisibleButtonOne() {
        onView(withId(R.id.btn_one)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_one)).check(matches(withText("1")));
    }

    @Test
    public void isVisibleButtonTwo() {
        onView(withId(R.id.btn_two)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_two)).check(matches(withText("2")));
    }

    @Test
    public void isVisibleButtonThere() {
        onView(withId(R.id.btn_there)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_there)).check(matches(withText("3")));
    }

    @Test
    public void isVisibleButtonFour() {
        onView(withId(R.id.btn_four)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_four)).check(matches(withText("4")));
    }

    @Test
    public void isVisibleButtonFive() {
        onView(withId(R.id.btn_five)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_five)).check(matches(withText("5")));
    }

    @Test
    public void isVisibleButtonSix() {
        onView(withId(R.id.btn_six)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_six)).check(matches(withText("6")));
    }

    @Test
    public void isVisibleButtonSeven() {
        onView(withId(R.id.btn_seven)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_seven)).check(matches(withText("7")));
    }

    @Test
    public void isVisibleButtonEight() {
        onView(withId(R.id.btn_eight)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_eight)).check(matches(withText("8")));
    }

    @Test
    public void isVisibleButtonNine() {
        onView(withId(R.id.btn_nine)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_nine)).check(matches(withText("9")));
    }

    @Test
    public void isVisibleButtonClear() {
        onView(withId(R.id.btn_clear)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_clear)).check(matches(withText("c")));
    }

    @Test
    public void isVisibleButtonDot() {
        onView(withId(R.id.btn_dot)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_dot)).check(matches(withText(".")));
    }

    @Test
    public void isVisibleTextDisplay() {
        onView(withId(R.id.tv_display)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_display)).check(matches(withText("0.00")));
    }
}