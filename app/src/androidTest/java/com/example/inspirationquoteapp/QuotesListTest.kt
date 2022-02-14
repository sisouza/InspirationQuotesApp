package com.example.inspirationquoteapp

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class QuotesListTest {

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

}