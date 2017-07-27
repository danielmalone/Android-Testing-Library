package com.finepointmobile.androidtestinglibrary;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by danielmalone on 7/27/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class, true, true);

    @Test
    public void typeMelMalone() throws Exception {
        Espresso.onView(withId(R.id.first_name)).perform(typeText("Mel Malone"));
        Espresso.onView(withId(R.id.first_name)).check(matches(withText("Mel Malone")));
    }
}