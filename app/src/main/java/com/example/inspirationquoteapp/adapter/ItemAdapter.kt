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


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        //returns a new ItemViewHolder instance where the root view is adapterLayout.
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Method called by the layout manager in order to replace the contents of a list item view
     *
     * params:
     * ItemViewHolder: previously created by the onCreateViewHolder() method
     * Int: current item position in the list.
     * **/
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        //update all the views referenced by the view holder to reflect the correct data for this item (affirmation string)
        holder.textView.text = context.resources.getString(item.stringResourceId)

    }


    /**
     *  return the size of dataset.
     *  app's data is in the dataset property passed into the ItemAdapter constructor (List<Affirmation>)
     * **/
    override fun getItemCount(): Int {
        return dataset.size
    }

}