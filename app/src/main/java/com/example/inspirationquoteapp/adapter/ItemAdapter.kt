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
 * Adapts Affirmation object instance(returned by loadAffirmations)
 *and turns it into a list item view
 * So that it can be displayed in the RecyclerView
 * **/

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {



    /**
     * A ViewHolder represents a single list item view in RecyclerView, and can be reused when possible
     * and references to the individual views within a list item layout
     * **/

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
     * Replaces the contents of a list item view
     * **/
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        //update all the views referenced by the view holder to reflect the correct data for this item (affirmation string)
        holder.textView.text = context.resources.getString(item.stringResourceId)

    }


    /**
     *  return the size of dataset(List<Affirmation>)
     * **/
    override fun getItemCount(): Int {
        return dataset.size
    }

}