package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    public Happy(Date moodDate) {
        super(moodDate);
    }

    @Override
    public String mood() {
        return "I am feeling happy.";
    }
}
