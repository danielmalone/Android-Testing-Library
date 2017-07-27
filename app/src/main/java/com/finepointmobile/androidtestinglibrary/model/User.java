package com.finepointmobile.androidtestinglibrary.model;

/**
 * Created by danielmalone on 7/27/17.
 */

public class User {

    private String mFirstName;
    private String mLastName;
    private int mAge;

    public User(String firstName, String lastName, int age) {
        mFirstName = firstName;
        mLastName = lastName;
        mAge = age;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }
}
