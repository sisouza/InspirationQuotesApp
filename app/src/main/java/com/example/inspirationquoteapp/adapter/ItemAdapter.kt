package com.example.inspirationquoteapp.adapter

import android.content.Context
import android.view.LayoutInflater
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


    /**
     *  called by the layout manager to create new view holders for the RecyclerView
     *  (when there are no existing view holders that can be reused).
     *
     * params:
     * parent:  the view group that the new list item view will be attached to (RecyclerView)
     * viewType:  when there are multiple item view types in the same RecyclerView
     * **/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        /**
         *  obtains an instance of LayoutInflater from the provided context (context of the parent).
         *  The layout inflater knows how to inflate an XML layout into a hierarchy of view objects.
         * **/
        val adapterLayout = LayoutInflater.from(parent.context)

            // method call to inflate the actual list item view
            //So adapterLayout holds a reference to the list item view
            .inflate(R.layout.list_item, parent, false)

        //returns a new ItemViewHolder instance where the root view is adapterLayout.
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


    /**
     *  return the size of dataset.
     *  app's data is in the dataset property passed into the ItemAdapter constructor (List<Affirmation>)
     * **/
    override fun getItemCount(): Int {
        return dataset.size
    }

}