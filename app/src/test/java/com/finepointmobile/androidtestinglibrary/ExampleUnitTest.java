package com.finepointmobile.androidtestinglibrary;

import com.finepointmobile.androidtestinglibrary.model.User;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void user_saved() throws Exception {
        User user = new User("Daniel", "Malone", 26);
        assertEquals("Daniel", user.getFirstName());
    }
}