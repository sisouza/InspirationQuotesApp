package com.example.inspirationquoteapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.inspirationquoteapp.R
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
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /** ItemAdapter needs information on how to resolve the string resources
     *  This, and other information about the app, is stored in a Context object instance
     *  that can be passed into an ItemAdapter instance
     * **/

    /**
     * RecyclerView doesn't interact directly with item views, but deals with ViewHolders instead.
     * A ViewHolder represents a single list item view in RecyclerView, and can be reused when possible
     *
     *  A ViewHolder instance holds references to the individual views within a list item layout
     * **/

    //ItemViewHolder is a subclass of RecyclerView.ViewHolder the view parameter is passed into the superclass constructor.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tvItemtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}