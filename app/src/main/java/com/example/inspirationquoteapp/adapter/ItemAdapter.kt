package com.example.inspirationquoteapp.adapter

import android.content.Context
import com.example.inspirationquoteapp.model.Affirmation


/**
 *
 * Adapts the data
 * will adapt an Affirmation object instance(returned by loadAffirmations)
 *
 * and turns it into a list item view
 * So that it can be displayed in the RecyclerView
 *
 * **/
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) {

    /** ItemAdapter needs information on how to resolve the string resources
     *  This, and other information about the app, is stored in a Context object instance
     *  that can be passed into an ItemAdapter instance
     * **/


}