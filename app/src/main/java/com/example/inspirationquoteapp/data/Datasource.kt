package com.example.inspirationquoteapp.data

import com.example.inspirationquoteapp.R
import com.example.inspirationquoteapp.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3)
        )
    }
}